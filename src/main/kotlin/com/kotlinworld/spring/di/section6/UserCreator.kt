package com.kotlinworld.spring.di.section6

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserCreator(
    @Qualifier("dbUserRepository") private val repository: UserRepository
) {
    fun createUserWithRandomId(user: String) {
        val id = UUID.randomUUID().toString()
        repository.createUser(id, user)
        println("[User Creation Success] User $user id: $id")
    }
}