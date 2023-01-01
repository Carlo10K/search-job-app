package org.example.jobsearch;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import io.github.cdimascio.dotenv.Dotenv;

public class AuthInterceptor implements RequestInterceptor {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_KEY = dotenv.get("API_KEY");
    private static final String API_HOST = dotenv.get("API_HOST");


    @Override
    public void apply(RequestTemplate template) {
        template.header("X-RapidAPI-Key",API_KEY);
        template.header("X-RapidAPI-Host", API_HOST);
    }
}

