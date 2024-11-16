package com.kotlinworld.spring.settingactuator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SettingActuatorApplication

fun main(args: Array<String>) {
    runApplication<SettingActuatorApplication>(*args)
}
