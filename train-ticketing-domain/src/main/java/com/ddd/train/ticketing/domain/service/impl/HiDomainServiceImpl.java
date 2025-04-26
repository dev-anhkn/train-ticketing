package com.ddd.train.ticketing.domain.service.impl;

import com.ddd.train.ticketing.domain.repository.HiDomainRepository;
import com.ddd.train.ticketing.domain.service.HiDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HiDomainServiceImpl implements HiDomainService {

    private final HiDomainRepository hiDomainRepository;

    @Override
    public String sayHi(String who) {
        return hiDomainRepository.sayHi(who);
    }
}
