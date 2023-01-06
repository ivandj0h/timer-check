package com.ivandjoh.hm.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"status", "status_code"})
public class BaseResponse {

    @JsonProperty("status")
    private int status;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("message")
    private String message;
}
