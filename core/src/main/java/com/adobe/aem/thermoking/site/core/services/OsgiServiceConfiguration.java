package com.adobe.aem.thermoking.site.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "OSGI service configuration for learning", description ="This is an example for learning purpose")
public @interface OsgiServiceConfiguration {

    @AttributeDefinition(name ="Course Name") String coursename() default "Aem Tutorials";

    @AttributeDefinition(name ="Course Duration") String courseduration() default "30 days";

    @AttributeDefinition(name ="Course Content") String courseContent() default "components,templates,services,models,servlets";
}
