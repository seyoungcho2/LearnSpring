package com.kotlinworld.spring.dbjpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbJpaApplication

fun main(args: Array<String>) {
    runApplication<DbJpaApplication>(*args)
}
