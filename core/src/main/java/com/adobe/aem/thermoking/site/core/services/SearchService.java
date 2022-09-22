package com.adobe.aem.thermoking.site.core.services;

import org.json.JSONObject;

public interface SearchService {

	JSONObject searchResult(String searchText, int startResult, int resultperpage);
}
