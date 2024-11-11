package com.kotlinworld.spring.di.section6

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(UserContainerConfiguration::class.java)

    context.beanDefinitionNames.forEach {
        println(it)
    }

    context.getBean(UserCreator::class.java).createUserWithRandomId("세영")
}
