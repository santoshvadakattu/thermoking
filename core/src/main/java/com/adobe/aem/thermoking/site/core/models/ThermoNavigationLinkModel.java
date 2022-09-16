package com.adobe.aem.thermoking.site.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ThermoNavigationLinkModel {
	@ChildResource
	private final List<ThermoNavModel> navLinks = new ArrayList<>();

	public List<ThermoNavModel> getNavLinks() {
		List<ThermoNavModel> linkscopy = new ArrayList<ThermoNavModel>();
		linkscopy.addAll(navLinks);
		return linkscopy;
	}
}