package com.adobe.aem.thermoking.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.wcm.core.components.models.Image;


@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ThermokingLogo{

	

    @ValueMapValue
    @Default(values = "image")
    private String img;
    
    @ValueMapValue
    @Default(values = "url")
    private String linkurl;

        
    public String getImg() {
		return img;
	}
	
	public String getLinkURL() {
		return linkurl;
	}
}
