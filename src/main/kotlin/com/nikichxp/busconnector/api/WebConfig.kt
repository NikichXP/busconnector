package com.nikichxp.busconnector.api

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class WebConfig {
    @Bean
    fun testRouter() = coRouter {
        "/test".nest {
            GET("") { request ->
                ok().bodyValueAndAwait(mapOf("message" to "Test endpoint is working!"))
            }
        }
    }
}
