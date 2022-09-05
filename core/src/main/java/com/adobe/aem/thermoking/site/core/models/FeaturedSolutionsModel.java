package com.adobe.aem.thermoking.site.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FeaturedSolutionsModel {
	

	@ChildResource
	private final List<FeatureItemslModel> linktree = new ArrayList<>();
	 
	public List<FeatureItemslModel> getLinktree() {
		List<FeatureItemslModel> linkscopy = new ArrayList<FeatureItemslModel>();
		linkscopy.addAll(linktree);
		return linkscopy ;
	}
}