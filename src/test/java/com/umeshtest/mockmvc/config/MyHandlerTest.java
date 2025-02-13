package com.umeshtest.mockmvc.config;

import com.umeshtest.mockmvc.handler.MyHandler;
import com.umeshtest.mockmvc.service.MyServiceNonBlocking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;

@WebFluxTest
public class MyHandlerTest {

    @Autowired
    private ApplicationContext context;

    @MockBean
    private MyServiceNonBlocking myService;

    private WebTestClient webTestClient;

    @BeforeEach
    void setUp() {
        RouterFunction<ServerResponse> route = context.getBean(RouterConfig.class).route(new MyHandler(myService));
        webTestClient = WebTestClient.bindToRouterFunction(route).build();
    }

    @Test
    void testProcessRequest() {
        when(myService.getMessage()).thenReturn(Mono.just("Mocked response"));

        webTestClient.post().uri("/nonblocking")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .value(response -> {
                    StepVerifier.create(Mono.just(response))
                            .expectNext("Mocked response")
                            .verifyComplete();
                });
    }

}