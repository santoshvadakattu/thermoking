package com.adobe.aem.thermoking.site.core.models;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class WeatherModel {
    @ValueMapValue
    public static String location;
        private String weatherReport() {
        try {
            String unitGroup = "metric";
            String apiKey = "BNQ99TYELHKNMVGT6SMGC45CU";
            String apiEndPoint = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
            URIBuilder builder = new URIBuilder(apiEndPoint + URLEncoder
                    .encode("Hyderabad", StandardCharsets
                            .UTF_8.toString()));
            builder.setParameter("unitGroup", unitGroup)
                    .setParameter("key", apiKey);
            HttpGet get = new HttpGet(builder.build());

            CloseableHttpClient httpclient = HttpClients.createDefault();

            CloseableHttpResponse response = httpclient.execute(get);

            String rawResult = "";

            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                System.out.printf("Bad response status code:%d%n",
                        response.getStatusLine().getStatusCode());
                return unitGroup;
            }
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                rawResult = EntityUtils.toString(entity, Charset.forName("utf-8"));
            }
            return rawResult;
        } catch (Exception e) {

        }
        return "";
    }

    public String getWeatherDetails() {

        return weatherReport();
    }


}
