package com.kotlinworld.spring.di.section1

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(DefaultContainerConfiguration::class.java)

    println(context.getBean("blogName"))
    println(context.getBean("blogAge"))

    println(context.getBean(String::class.java))
    println(context.getBean(Int::class.java))
}
