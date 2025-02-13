package com.umeshtest.mockmvc.handler;

import com.umeshtest.mockmvc.service.MyServiceNonBlocking;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class MyHandler {

    private final MyServiceNonBlocking myServiceNonBlocking;

    public MyHandler(MyServiceNonBlocking myServiceNonBlocking) {
        this.myServiceNonBlocking = myServiceNonBlocking;
    }

    public Mono<ServerResponse> processRequest(ServerRequest request) {
        System.out.println(request.uri());
        return ServerResponse.ok().body(myServiceNonBlocking.getMessage(), String.class);
    }

}
