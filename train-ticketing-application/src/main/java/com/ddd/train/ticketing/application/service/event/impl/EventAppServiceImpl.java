package com.ddd.train.ticketing.application.service.event.impl;

import com.ddd.train.ticketing.application.service.event.EventAppService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {

    @Override
    public String sayHi(String who) {
        return "Hello " + who + "!";
    }
}
