package com.kotlinworld.spring.di.section4

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UserContainerConfiguration {
    @Bean
    fun userRepository(): UserRepository {
        return InMemoryUserRepository()
    }

    @Bean
    fun userCreator(repository: UserRepository): UserCreator {
        return UserCreator(repository)
    }
}