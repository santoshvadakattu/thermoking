package com.adobe.aem.thermoking.site.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ThermoNavModel {

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String navigationLabel;

	@ValueMapValue
	private String navigationURL;

	public String getNavigationLabel() {
		return navigationLabel;
	}

	public String getNavigationURL() {
		return navigationURL;
	}

		public String getnavigationURL() {
		return StringUtils.join(navigationURL,".html");
	}

}
