package com.adobe.aem.thermoking.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PictureModel {
	@ValueMapValue
	private String fileReference;
  @ValueMapValue
  private String fileReference1;
  
  
	public String getFileReference1() {
	return fileReference1;
}


	public String getFileReference() {
		return fileReference;
	}


}
