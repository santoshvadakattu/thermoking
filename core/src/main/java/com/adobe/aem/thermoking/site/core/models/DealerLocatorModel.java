package com.adobe.aem.thermoking.site.core.models;


import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DealerLocatorModel {
	
	
    @ValueMapValue
    @Default(values = "title")
    private String titlee;
    
    @ChildResource
    @Default(values = "AEM")
    private String descriptionn;
    
    @ValueMapValue
    @Default(values = "button")
    private String buttonn;
    
    @ValueMapValue
    @Default(values = "image")
    private String img;

    
    @ValueMapValue
    @Default(values = "url")
    private String linkurl;


	public String getTitle() {
		return titlee;
	}
	
	public String getDescription() {
		return descriptionn;
	}			
	
	public String getButton() {
		return buttonn;
	}
	
	public String getImage() {
		return img;
	}
	
	public String getLinkURL() {
		return linkurl;
	}
	
	
		
		
	}
	

	
	
	
