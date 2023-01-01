package org.example.jobsearch.data;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {

    @SerializedName("employer_name")
    private String company;

    @SerializedName("employer_logo")
    private String companyLogo;

    @SerializedName("employer_website")
    private String companyWebSite;

    @SerializedName("job_publisher")
    private String publisher;

    @SerializedName("job_id")
    private String id;

    @SerializedName("job_employment_type")
    private String type;

    @SerializedName("job_title")
    private String title;

    @SerializedName("job_apply_link")
    private String applyLink;

    @SerializedName("job_description")
    private String description;

    @SerializedName("job_is_remote")
    private boolean remote;

    @SerializedName("job_posted_at_datetime_utc")
    private String date;

    @SerializedName("job_city")
    private String city;

    @SerializedName("job_country")
    private String country;

    @SerializedName("job_google_link")
    private String googleLink;

    @SerializedName("job_offer_expiration_datetime_utc")
    private String expirationDate;

    @SerializedName("Qualifications")
    private String qualifications;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getApplyLink() {
        return applyLink;
    }

    public void setApplyLink(String applyLink) {
        this.applyLink = applyLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGoogleLink() {
        return googleLink;
    }

    public void setGoogleLink(String googleLink) {
        this.googleLink = googleLink;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return remote == that.remote && Objects.equals(company, that.company) && Objects.equals(companyLogo, that.companyLogo) && Objects.equals(companyWebSite, that.companyWebSite) && Objects.equals(publisher, that.publisher) && Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(title, that.title) && Objects.equals(applyLink, that.applyLink) && Objects.equals(description, that.description) && Objects.equals(date, that.date) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(googleLink, that.googleLink) && Objects.equals(expirationDate, that.expirationDate) && Objects.equals(qualifications, that.qualifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, companyLogo, companyWebSite, publisher, id, type, title, applyLink, description, remote, date, city, country, googleLink, expirationDate, qualifications);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "company='" + company + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                ", companyWebSite='" + companyWebSite + '\'' +
                ", publisher='" + publisher + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", applyLink='" + applyLink + '\'' +
                ", description='" + description + '\'' +
                ", remote=" + remote +
                ", date='" + date + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", googleLink='" + googleLink + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", qualifications='" + qualifications + '\'' +
                '}';
    }
}
