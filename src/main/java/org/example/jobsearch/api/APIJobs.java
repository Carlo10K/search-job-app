package org.example.jobsearch.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;
import org.example.jobsearch.data.JobData;

import java.util.List;
import java.util.Map;

@Headers({"Accept: application/json"})
public interface APIJobs {
    @RequestLine("GET /search")
    List<JobData> jobs(@QueryMap Map<String, Object> queryMap);
}

