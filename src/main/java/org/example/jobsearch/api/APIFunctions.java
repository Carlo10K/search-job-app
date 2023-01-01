package org.example.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.example.jobsearch.AuthInterceptor;

public interface APIFunctions {
    static <T> T buildAPI(Class<T> clazz, String url){
        return Feign.builder()
                .client(new OkHttpClient())
                .requestInterceptor(new AuthInterceptor())
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}
