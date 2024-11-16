package com.kotlinworld.spring.settingconfigurationproperties

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ServerConfiguration::class)
class SettingConfigurationpropertiesApplication

fun main(args: Array<String>) {
    runApplication<SettingConfigurationpropertiesApplication>(*args)
}
