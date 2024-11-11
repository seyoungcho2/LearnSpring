package com.kotlinworld.spring.di

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiApplication

fun main(args: Array<String>) {
    runApplication<DiApplication>(*args)
}
