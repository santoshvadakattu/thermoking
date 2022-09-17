package com.adobe.aem.thermoking.site.core.models;


import com.adobe.aem.thermoking.site.core.services.IWeatherOSGiService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WeatherTestModel {
    private static final Logger LOG = LoggerFactory.getLogger(WeatherTestModel.class);
    @OSGiService
    IWeatherOSGiService iWeatherOSGiService;

    @ValueMapValue
    private String location;

    public String getLocation() {
        LOG.info("nn"); // Here logs are printing
        return location;
    }

    public String getWeatherDetails(String location) {
        LOG.info("info MSG"); // Here logs are not printing
        LOG.debug("Debugg MSG",getWeatherDetails(location));
        return iWeatherOSGiService.getWeatherReportDtails(location);
    }

}
