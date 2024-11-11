package com.kotlinworld.spring.di.section10

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import java.util.*

//@Component
//class UserCreator @Autowired constructor(
//    private val repository: UserRepository
//) {
//    fun createUserWithRandomId(user: String) {
//        val id = UUID.randomUUID().toString()
//        repository.createUser(id, user)
//        println("[User Creation Success] User $user id: $id")
//    }
//}

// Autowired 생략 가능
@Component
class UserCreator(
    private val repository: UserRepository
) {
    fun createUserWithRandomId(user: String) {
        val id = UUID.randomUUID().toString()
        repository.createUser(id, user)
        println("[User Creation Success] User $user id: $id")
    }
}