package com.adobe.aem.thermoking.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ElectrifiedModel {

    @ValueMapValue
	private String fileReference;
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String text;
	
	@ValueMapValue
	private String button;
	
	public String getFileReference() {
		return fileReference;
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public String getButton() {
		return button;
	}
	
}
