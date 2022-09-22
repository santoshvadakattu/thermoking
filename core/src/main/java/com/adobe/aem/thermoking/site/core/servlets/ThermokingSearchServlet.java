package com.adobe.aem.thermoking.site.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.thermoking.site.core.services.SearchService;

@Component(service = Servlet.class)
@SlingServletPaths(value = { "/bin/thermoking/search" })

public class ThermokingSearchServlet extends SlingAllMethodsServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOG = LoggerFactory.getLogger(ThermokingSearchServlet.class);

	@Reference
	SearchService searchService;

	@Override
	protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp)
			throws ServletException, IOException {
		JSONObject searchResult = null;
		try {
			String searchtext = req.getRequestParameter("searchText").getString();
			LOG.debug("search text is : " + searchtext);
			int pageNumber = Integer.parseInt(req.getRequestParameter("pageNumber").getString()) - 1;
			LOG.debug("pageNumber is : " + pageNumber);
			int resultPerPage = Integer.parseInt(req.getRequestParameter("resultPerPage").getString());
			LOG.debug("resultPerPage is : " + resultPerPage);

			int startResult = pageNumber * resultPerPage;
			searchResult = searchService.searchResult(searchtext, startResult, resultPerPage);
		} catch (Exception e) {
			LOG.error("\n ERROR {} ", e.getMessage());
		}

		resp.setContentType("application/json");
		resp.getWriter().write(searchResult.toString());
	}
}
