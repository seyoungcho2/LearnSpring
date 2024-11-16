package com.kotlinworld.spring.logging

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoggingApplication

fun main(args: Array<String>) {
    runApplication<LoggingApplication>(*args)
    // 로그 추가
    val logger = LoggerFactory.getLogger(LoggingApplication::class.java)
    logger.debug("Hello, Kotlin World!")
}
