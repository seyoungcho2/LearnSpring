package com.kotlinworld.spring.di.section3

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DefaultContainerConfiguration {
    @Bean(name = ["blogName1", "blogName2"])
    fun blogName(): String {
        return "KotlinWorld"
    }

    @Bean
    fun blogAge(): Int {
        return 3
    }
}