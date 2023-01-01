package org.example.jobsearch;

import com.beust.jcommander.JCommander;
import io.github.cdimascio.dotenv.Dotenv;
import org.example.jobsearch.api.APIJobs;
import org.example.jobsearch.cli.CLIArguments;
import org.example.jobsearch.cli.CLIFunctions;
import org.example.jobsearch.data.JobData;
import org.example.jobsearch.data.JobPosition;

import java.util.*;
import java.util.stream.Stream;

import static org.example.jobsearch.CommanderFunctions.buildCommanderWithName;
import static org.example.jobsearch.CommanderFunctions.parseArguments;
import static org.example.jobsearch.api.APIFunctions.buildAPI;

public class JobSearch {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API = dotenv.get("API_URL");

    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI = parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList())
                .stream()
                .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cliArguments -> !cliArguments.isHelp())
                        .filter(cliArguments -> cliArguments.getKeyword() != null)
                        .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(JobSearch::executeRequest)
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<JobData> executeRequest(Map<String, Object> params){
        APIJobs api = buildAPI(APIJobs.class, API);

        return Stream.of(params)
                .map(api::jobs)
                .flatMap(Collection::stream);
    }
}