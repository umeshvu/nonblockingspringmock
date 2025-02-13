package com.umeshtest.mockmvc.service;

import reactor.core.publisher.Mono;

public interface MyServiceNonBlocking {
    Mono<String> getMessage();
}
