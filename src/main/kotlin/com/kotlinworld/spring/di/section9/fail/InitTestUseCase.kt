package com.kotlinworld.spring.di.section9.fail

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Lazy
@Component
class InitTestUseCase(
    private val string: String
) {
    init {
        println("InitTestUseCase initialized")
    }
}