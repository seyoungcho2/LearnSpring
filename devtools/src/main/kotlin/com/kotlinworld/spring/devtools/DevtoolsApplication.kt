package com.kotlinworld.spring.devtools

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DevtoolsApplication

fun main(args: Array<String>) {
    runApplication<DevtoolsApplication>(*args)
}
