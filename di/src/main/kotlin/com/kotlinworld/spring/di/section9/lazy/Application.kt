package com.kotlinworld.spring.di.section9.lazy

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(InitConfiguration::class.java)
    println("After container initialized")
}
