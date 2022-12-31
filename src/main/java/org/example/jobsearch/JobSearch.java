package org.example.jobsearch;

import com.beust.jcommander.JCommander;
import org.example.jobsearch.cli.CLIArguments;

import static org.example.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        
    }
}