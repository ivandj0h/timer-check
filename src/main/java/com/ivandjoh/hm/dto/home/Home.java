package com.ivandjoh.hm.dto.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ivandjoh.hm.dto.base.BaseResponse;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({"status", "status_code", "message"})
public class Home {

    @JsonProperty("status")
    private int status;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private List<HomeData> data;

    public Home(BaseResponse baseResponse, List<HomeData> data) {
        this.status = baseResponse.getStatus();
        this.statusCode = baseResponse.getStatusCode();
        this.message = baseResponse.getMessage();
        this.data = data;
    }

}
