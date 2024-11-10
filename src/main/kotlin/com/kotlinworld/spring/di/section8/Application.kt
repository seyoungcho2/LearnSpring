package com.kotlinworld.spring.di.section8

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(ScanConfiguration::class.java)

    context.beanDefinitionNames.forEach {
        println(it)
    }
}
