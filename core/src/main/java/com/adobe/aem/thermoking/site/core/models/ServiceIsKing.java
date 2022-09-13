package com.adobe.aem.thermoking.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServiceIsKing {


	@ValueMapValue	
	private String serviceName;
	
	@ValueMapValue
	private String discription;


	public String getServiceTitle() {
		return serviceName;
	}


	public String getServiceDiscription() {
		return discription;
	}

}