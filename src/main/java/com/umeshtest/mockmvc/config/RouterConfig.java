package com.umeshtest.mockmvc.config;

import com.umeshtest.mockmvc.handler.MyHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
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

    @Bean
    public RouterFunction<ServerResponse> testPostman(MyHandler myHandler) {
        return RouterFunctions
                .route()
                .GET("/postman", myHandler::testPostman)
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> routingFunction() {
        return RouterFunctions.route(RequestPredicates.GET("/greet"),
                request -> ServerResponse.ok().bodyValue("Hello, World!"));
    }

    @Bean
    public RouterFunction<ServerResponse> routingFunction1() {
        return RouterFunctions.route().GET("/test", request -> ServerResponse.ok().bodyValue("Hello, World!")).build();
    }

}
