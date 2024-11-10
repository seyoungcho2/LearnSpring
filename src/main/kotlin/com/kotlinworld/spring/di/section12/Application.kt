package com.kotlinworld.spring.di.section12

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(UserContainerConfiguration::class.java)

    val controller = context.getBean(CartController::class.java)
    controller.addToCart("1", "item1")
    controller.addToCart("2", "item2")

    controller.shoppingCartMap.forEach {
        println("User: ${it.key}, Items: ${it.value}")
    }

    println(context.getBean(CartControllerProvider::class.java).provideCartController())
    println(context.getBean(CartControllerProvider::class.java).provideCartController())
}
