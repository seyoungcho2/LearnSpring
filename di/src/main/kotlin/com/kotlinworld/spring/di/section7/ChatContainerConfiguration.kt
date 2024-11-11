package com.kotlinworld.spring.di.section7

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@ComponentScan
@Configuration
class ChatContainerConfiguration {
    @Bean
    fun aChatService(): AChatService {
        return AChatService()
    }
}