package com.adobe.aem.thermoking.site.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Brocher {
	
	
    @ValueMapValue
    @Default(values = "title")
    private String titlee;
    
    @ChildResource
    @Default(values = "AEM")
    private String descriptionn;
    
    @ValueMapValue
    @Default(values = "button")
    private String button1;
    
	@ValueMapValue
    @Default(values = "button")
    private String button2;
    
    @ValueMapValue
    @Default(values = "img")
    private String img;

    
    @ValueMapValue
    @Default(values = "url.1")
    private String linkurl1;
    
    @ValueMapValue
    @Default(values = "url.2")
    private String linkurl2;

	@ValueMapValue
    private String buttontextOne;
    
    @ValueMapValue
    private String buttontextTwo;    
    


	public String getTitle() {
		return titlee;
	}
	
	public String getDescription() {
		return descriptionn;
	}			

	public String getButton1() {	
		return button1;
	}

	public String getSecondButton() {
		return button2;
	}
	
	public String getImage() {
		return img;
	}
	
	public String getLinkURL1() {
		return linkurl1;
	}
	public String getLinkURL2() {
		return linkurl2;
	}
	
    
    public String getButtontextOne() {
		return buttontextOne;
	}

	public String getButtontextTwo() {
		return buttontextTwo;
	}	
	
		
	}
	

	
	
	
