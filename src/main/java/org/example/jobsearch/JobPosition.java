package org.example.jobsearch;

import java.util.Objects;

public class JobPosition {
    private String date;
    private String jobtitle;

    private String companyname;
    private String location;
    private String salary;
    private String url;
    private String summary;

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(date, that.date) && Objects.equals(jobtitle, that.jobtitle) && Objects.equals(companyname, that.companyname) && Objects.equals(location, that.location) && Objects.equals(salary, that.salary) && Objects.equals(url, that.url) && Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, jobtitle, companyname, location, salary, url, summary);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "date='" + date + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", companyname='" + companyname + '\'' +
                ", location='" + location + '\'' +
                ", salary='" + salary + '\'' +
                ", url='" + url + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
