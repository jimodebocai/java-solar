package com.miele.solar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ContextConfig {

    @Bean("OKHttp3")
    public RestTemplate OKHttp3RestTemplate() {
        RestTemplate restTemplate = new RestTemplate(new OkHttp3ClientHttpRequestFactory());
        return restTemplate;
    }
}
