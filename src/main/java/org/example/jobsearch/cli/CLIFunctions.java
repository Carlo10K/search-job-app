package org.example.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {
    public static Map<String, Object> toMap(CLIArguments cliArguments){
        Map<String, Object> params = new HashMap<>();

        params.put("query", cliArguments.getKeyword());
        params.put("location", cliArguments.getLocation());
        params.put("type", cliArguments.getType());
        params.put("page", cliArguments.getPage());
        params.put("numpage", cliArguments.getNumPages());
        params.put("dateposted", cliArguments.getDatePosted());

        if(cliArguments.isRemote()){
            params.put("remote", true);
        }

        return params;
    }
}
