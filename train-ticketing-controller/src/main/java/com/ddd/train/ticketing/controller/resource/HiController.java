package com.ddd.train.ticketing.controller.resource;

import com.ddd.train.ticketing.application.service.event.EventAppService;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
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
    @RateLimiter(name = "backendA", fallbackMethod = "fallbackPing")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok(eventAppService.sayHi("KIM"));
    }

    public String fallbackPing(String message) {
        return "TOOOOO";
    }
    @GetMapping("/hi")
    @RateLimiter(name = "backendB", fallbackMethod = "fallbackPing")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(eventAppService.sayHi("Hi"));
    }
}
