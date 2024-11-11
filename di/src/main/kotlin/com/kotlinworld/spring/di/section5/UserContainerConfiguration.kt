package com.kotlinworld.spring.di.section5

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary

@Configuration
class UserContainerConfiguration {
    @Primary
    @Bean
    fun inMemoryUserRepository(): UserRepository {
        return InMemoryUserRepository()
    }

    @Qualifier("dbUserRepository")
    @Bean
    fun dbUserRepository(): UserRepository {
        return DbUserRepository()
    }

    @Bean
    fun userCreator(@Qualifier("dbUserRepository") repository: UserRepository): UserCreator {
        return UserCreator(repository)
    }
}