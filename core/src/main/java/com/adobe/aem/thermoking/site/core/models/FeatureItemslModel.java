package com.adobe.aem.thermoking.site.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeatureItemslModel {

	@ValueMapValue
	private String fileReference;

	@ValueMapValue
	private String title;

	@ValueMapValue
	private String linkUrl;

	@ValueMapValue
	private String text;

	public String getFileReference() {
		return fileReference;
	}

	public String getTitle() {
		return title;
	}

	public String getLinkurl() {
		return StringUtils.join(linkUrl, ".html");
	}

	public String getText() {
		return text;
	}
}
