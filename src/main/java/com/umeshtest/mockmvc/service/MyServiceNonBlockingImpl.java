package com.umeshtest.mockmvc.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MyServiceNonBlockingImpl implements MyServiceNonBlocking {
    @Override
    public Mono<String> getMessage() {
        return Mono.just("this is a sample text");
    }
}
