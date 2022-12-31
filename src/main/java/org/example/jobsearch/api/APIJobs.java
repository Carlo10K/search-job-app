package org.example.jobsearch.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;
import org.example.jobsearch.JobPosition;

import java.util.List;
import java.util.Map;

@Headers("Accept: application/json")
public interface APIJobs {

    @RequestLine("POST /")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);


}