package com.kotlinworld.spring.di.section4

import java.util.*

class UserCreator(private val repository: UserRepository) {
    fun createUserWithRandomId(user: String) {
        val id = UUID.randomUUID().toString()
        repository.createUser(id, user)
        println("[User Creation Success] User $user id: $id")
    }
}