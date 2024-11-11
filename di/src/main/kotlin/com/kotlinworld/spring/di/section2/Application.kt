package com.kotlinworld.spring.di.section2

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(DefaultContainerConfiguration::class.java)

    val allBeanNames: Array<String> = context.beanDefinitionNames
    allBeanNames.forEach {
        println(it)
    }
}
