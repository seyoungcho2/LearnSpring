package com.kotlinworld.spring.di.section7

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(ChatContainerConfiguration::class.java)

    context.getBean(AChatService::class.java).sendMessage("Hello, World!")
}
