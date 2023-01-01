package org.example.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import org.example.jobsearch.AuthInterceptor;

public interface APIFunctions {
    static <T> T buildAPI(Class<T> clazz, String url){
        return Feign.builder()
                .requestInterceptor(new AuthInterceptor())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}
