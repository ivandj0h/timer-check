package com.ivandjoh.hm.utils;

import com.ivandjoh.hm.dto.base.BaseResponse;
import com.ivandjoh.hm.dto.home.Home;
import com.ivandjoh.hm.dto.home.HomeData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TimeHelper {

    public static Home getMyHelp() {

        Date dt = new Date();
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("kk:mm");

        String dtt = dateFormat.format(dt);

        String[] parts = dtt.split(":");

        HomeData homeData = new HomeData();
        homeData.setStartWork("10:00");
        homeData.setEndWork("18:00");
        homeData.setTimeNow(parts[0]);
        homeData.setMinutesNow(parts[1]);
        homeData.setCheckOut(dtt.compareTo(homeData.getEndWork()) > 0);

        ArrayList<HomeData> homeDataList = new ArrayList<>();
        homeDataList.add(homeData);

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(200);
        baseResponse.setStatusCode("OK");
        baseResponse.setMessage("Success");

        Home home = new Home(baseResponse, homeDataList);
        home.setStatus(baseResponse.getStatus());
        home.setStatusCode(baseResponse.getStatusCode());
        home.setMessage(baseResponse.getMessage());
        home.setData(homeDataList);

        return home;
    }
}
