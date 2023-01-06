package com.ivandjoh.hm.service.implement;

import com.ivandjoh.hm.service.HomeService;
import com.ivandjoh.hm.utils.TimeHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public ResponseEntity<?> getHome() {

        return ResponseEntity
                .status(200)
                .body(TimeHelper.getMyHelp());
    }
}

