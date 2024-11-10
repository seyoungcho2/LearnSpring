package com.kotlinworld.spring.di.section6

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

interface UserRepository {
    fun createUser(id: String, user: String)
}

@Primary
@Component
class InMemoryUserRepository(): UserRepository {
    override fun createUser(id: String, user: String) {
        println("User $user created with id: $id in InMemoryUserRepository")
    }
}

@Qualifier("dbUserRepository")
@Component
class DbUserRepository(): UserRepository {
    override fun createUser(id: String, user: String) {
        println("User $user created with id: $id in DbUserRepository")
    }
}