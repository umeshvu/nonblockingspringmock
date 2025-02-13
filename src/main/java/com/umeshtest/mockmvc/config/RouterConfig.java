package com.umeshtest.mockmvc.config;

import com.umeshtest.mockmvc.handler.MyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> route(MyHandler myHandler) {
        return RouterFunctions
                .route()
                .POST("/nonblocking", myHandler::processRequest)
                .build();
    }
}
