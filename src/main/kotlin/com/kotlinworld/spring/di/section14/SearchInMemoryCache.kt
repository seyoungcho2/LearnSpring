package com.kotlinworld.spring.di.section14

import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.stereotype.Component

@Component
class SearchInMemoryCache() {
    private val searchResults: MutableList<String> = mutableListOf()

    @PostConstruct
    fun setUp() {
        searchResults.addAll(
            listOf("Search Result 1", "Search Result 2")
        )
        println("Search results are loaded")
    }

    @PreDestroy
    fun cleanUp() {
        searchResults.clear()
        println("Search results are cleared")
    }
}