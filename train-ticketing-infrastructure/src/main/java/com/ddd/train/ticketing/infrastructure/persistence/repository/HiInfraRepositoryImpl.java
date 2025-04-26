package com.ddd.train.ticketing.infrastructure.persistence.repository;

import com.ddd.train.ticketing.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HiInfraRepositoryImpl implements HiDomainRepository {

    @Override
    public String sayHi(String h) {
        return "HiInfraRepository: " + h;
    }
}
