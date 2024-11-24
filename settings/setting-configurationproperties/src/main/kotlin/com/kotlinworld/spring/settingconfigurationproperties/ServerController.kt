package com.kotlinworld.spring.settingconfigurationproperties

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ServerController(
    private val serverConfiguration: ServerConfiguration
) {
    @GetMapping("/server/config")
    fun getServerConfiguration(): ServerConfiguration {
        return serverConfiguration
    }
}