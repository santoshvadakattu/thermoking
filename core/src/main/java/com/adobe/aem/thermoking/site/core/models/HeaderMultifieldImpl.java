package com.adobe.aem.thermoking.site.core.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class, adapters = HeaderMultifield.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderMultifieldImpl implements HeaderMultifield {
	private static final Logger LOG = LoggerFactory.getLogger(HeaderMultifieldImpl.class);

	@Inject
    Resource componentResource;

    @ValueMapValue
    @Default(values = "AEM")
    private String authorname;

    @ValueMapValue
    private List<String> books;

	public String getAuthorname() {
		return authorname;
	}

	public List<String> getBooks() {
		return books;
	}

	@Override
	public List<String> getAuthorName() {
		// TODO Auto-generated method stub
		return null;
	}


	/*
	 * @Override public List<String> getAuthorName() { if (books != null) { return
	 * new ArrayList<String>(books); }
	 * 
	 * else { return Collections.emptyList(); }
	 * 
	 * }
	 */

	
	
	
}
