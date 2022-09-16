package com.adobe.aem.thermoking.site.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = OsgiServiceInterface.class,immediate = true)
@Designate(ocd= OsgiServiceConfiguration.class)
public class OsgiServiceimpl implements OsgiServiceInterface {
    private OsgiServiceConfiguration configuration;

    @Activate
    private void activate(OsgiServiceConfiguration config)
    {
    configuration =config;
   }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public String getCourseDuration() {
        return null;
    }

    @Override
    public String getCourseContent() {
        return null;
    }
}
