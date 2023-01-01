package org.example.jobsearch.data;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobData {
    private String status;

    @SerializedName("request_id")
    private String requestId;

    @SerializedName("data")
    private JobPosition data;

    public JobData() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public JobPosition getData() {
        return data;
    }

    public void setData(JobPosition data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobData jobData = (JobData) o;
        return Objects.equals(status, jobData.status) && Objects.equals(requestId, jobData.requestId) && Objects.equals(data, jobData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, requestId, data);
    }

    @Override
    public String toString() {
        return "JobData{" +
                "status='" + status + '\'' +
                ", requestId='" + requestId + '\'' +
                ", data=" + data +
                '}';
    }
}
