package org.example.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }

    @Parameter(
        required = true,
        descriptionKey = "KEYWORD",
        validateWith = CLIKeywordValidator.class,
        description = "KEYWORD"
    )
    private String keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busqueda puede incluir una ubicacion"
    )
    private String location;

    @Parameter(
            names = {"--type", "-t"},
            description = "FULLTIME, CONTRACTOR, PARTTIME, INTERN"
    )
    private String type;


    @Parameter(
            names = {"--page", "p"},
            description = "La API devuelve 50 resultados, usa un numero para la pagina"
    )
    private int page=1;

    @Parameter(
            names = {"--numpage", "-np"},
            description = "La API devuelve 50 resultados, cuantas paginas quieres"
    )
    private int numPages=1;


    @Parameter(
            names = {"--dateposted", "-d"},
            description = "all, today, 3days, week, month"
    )
    private String datePosted = "all";

    @Parameter(
            names = {"--remote", "-r"},
            description = "Agrega si queremos trabajos en remoto"
    )
    private boolean isRemote;

    @Parameter(
            names = "--help",
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "Mostrar ayuda"
    )
    private boolean isHelp;


    public int getPage() {
        return page;
    }

    public int getNumPages() {
        return numPages;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public boolean isRemote() {
        return isRemote;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", page=" + page +
                ", numPages=" + numPages +
                ", datePosted='" + datePosted + '\'' +
                ", isRemote=" + isRemote +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
