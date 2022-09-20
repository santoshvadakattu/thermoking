package com.adobe.aem.thermoking.site.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.thermoking.site.core.services.IWeatherOSGiService;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WeatherModel {

	@Inject
	IWeatherOSGiService iWeatherOSGiService;

	@ValueMapValue
	public static String location;

	public String getWeatherDetails() {
		return iWeatherOSGiService.getWeatherReportDetails(location);
	}

	public static String getLocation() {
		return location;
	}

}