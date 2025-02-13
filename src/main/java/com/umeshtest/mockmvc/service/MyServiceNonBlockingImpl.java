package com.umeshtest.mockmvc.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class MyServiceNonBlockingImpl implements MyServiceNonBlocking {
    @Override
    public Mono<String> getMessage() {

//        TOS
        Flux<Integer> celsiusTemperatures = Flux.just(0, 25, 100);
        System.out.println(celsiusTemperatures);
        celsiusTemperatures.subscribe(System.out::println);
        celsiusTemperatures.subscribe(data -> {
            System.out.println(data);
        });


        return Mono.just("this is a sample text");
    }

    public Flux<Integer> testPostman() {
        return Flux.just(0, 25, 100, 130, 167)
                .delayElements(Duration.ofSeconds(1)); // Delay each element by 1 second
    }
}
