package com.ddd.train.ticketing.controller.resource;

import com.ddd.train.ticketing.application.service.event.EventAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HiController {

    private final EventAppService eventAppService;

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {

        return ResponseEntity.ok(eventAppService.sayHi("KIM"));
    }
}
