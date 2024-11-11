package com.kotlinworld.spring.di.section11

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(UserContainerConfiguration::class.java)

    println(context.getBean(ShoppingCart::class.java))
    println(context.getBean(ShoppingCart::class.java))

    println(context.getBean(CartController::class.java))
    println(context.getBean(CartController::class.java))
}
