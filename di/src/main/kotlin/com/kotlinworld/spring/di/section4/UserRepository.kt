package com.kotlinworld.spring.di.section4

interface UserRepository {
    fun createUser(id: String, user: String)
}

class InMemoryUserRepository(): UserRepository {
    override fun createUser(id: String, user: String) {
        println("User $user created with id: $id in InMemoryUserRepository")
    }
}