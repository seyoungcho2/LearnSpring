package com.kotlinworld.spring.di.section2

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DefaultContainerConfiguration {
    @Bean
    fun blogName(): String {
        return "KotlinWorld"
    }

    @Bean
    fun blogAge(): Int {
        return 3
    }
}