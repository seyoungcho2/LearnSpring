package com.kotlinworld.spring.settings

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SettingsApplication

fun main(args: Array<String>) {
    runApplication<SettingsApplication>(*args)
}
