package org.example.jobsearch.cli;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();

        params.put("query", cliArguments.getKeyword());
        params.put("employment_types", cliArguments.getType());
        params.put("page", cliArguments.getPage());
        params.put("num_pages", cliArguments.getNumPages());
        params.put("date_posted", cliArguments.getDatePosted());

        if(cliArguments.isRemote()){
            params.put("remote_jobs_only",true);
        }


        return params;
    }
}
