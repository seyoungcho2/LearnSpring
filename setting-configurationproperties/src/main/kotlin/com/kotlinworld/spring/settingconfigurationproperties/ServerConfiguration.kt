package com.kotlinworld.spring.settingconfigurationproperties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "server")
data class ServerConfiguration(
    val serverName: String,
    val allowedClients: List<String>
)