package com.kotlinworld.spring.di.section9.lazy

import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Component

@Lazy
@Component
class InitTestUseCase {
    init {
        println("InitTestUseCase initialized")
    }
}