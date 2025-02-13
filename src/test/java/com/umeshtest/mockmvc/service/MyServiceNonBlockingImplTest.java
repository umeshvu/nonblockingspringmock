package com.umeshtest.mockmvc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
class MyServiceNonBlockingImplTest {

    @InjectMocks
    private MyServiceNonBlockingImpl myService;


    @Test
    void getMessage() {
        // Execute the method and verify the result
        Mono<String> result = myService.getMessage();

        // Use StepVerifier to test the Mono
        StepVerifier.create(result)
                .expectNext("this is a sample text")
                .verifyComplete();
    }
}