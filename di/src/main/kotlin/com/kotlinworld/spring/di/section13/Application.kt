package com.kotlinworld.spring.di.section13

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext(SearchConfiguration::class.java)
}
