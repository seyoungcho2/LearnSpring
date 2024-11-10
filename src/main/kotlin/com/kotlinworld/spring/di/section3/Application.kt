package com.kotlinworld.spring.di.section3

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(DefaultContainerConfiguration::class.java)

    println(context.getBean("blogName1"))
    println(context.getBean("blogName2"))
}
