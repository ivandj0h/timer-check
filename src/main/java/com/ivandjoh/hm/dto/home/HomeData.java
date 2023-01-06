package com.ivandjoh.hm.dto.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"start_work", "end_work"})
public class HomeData {
    @JsonProperty("start_work")
    private String startWork;
    @JsonProperty("end_work")
    private String endWork;
    @JsonProperty("time_now")
    private String timeNow;
    @JsonProperty("minutes_now")
    private String minutesNow;
    @JsonProperty("check_out")
    private boolean checkOut;
}
