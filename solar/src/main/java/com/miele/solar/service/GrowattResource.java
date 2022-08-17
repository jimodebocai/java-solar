package com.miele.solar.service;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.miele.solar.model.Growatt;

public class GrowattResource {
    
    @Resource
    private RestTemplate restTemplate;

    public void getGrowattData() {
        String url = "http://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<Growatt> responseEntity = restTemplate.getForEntity(url, Growatt.class);
        Growatt growatt = responseEntity.getBody();
        System.out.println("Http响应Body:" + growatt.toString());
        HttpStatus statusCode = responseEntity.getStatusCode();
        int statusCodeVal = responseEntity.getStatusCodeValue();
        HttpHeaders headers = responseEntity.getHeaders();
        System.out.println("Http响应状态:" + statusCode);
        System.out.println("Http响应状态码:" + statusCodeVal);
        System.out.println("Http Headers信息:" + headers);
    }

}
