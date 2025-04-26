package com.ddd.train.ticketing.application.service.event.impl;

import com.ddd.train.ticketing.application.service.event.EventAppService;
import com.ddd.train.ticketing.domain.service.HiDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventAppServiceImpl implements EventAppService {

    // Call domain service
    private final HiDomainService hiDomainService;

    @Override
    public String sayHi(String who) {
        return hiDomainService.sayHi(who);
    }
}
