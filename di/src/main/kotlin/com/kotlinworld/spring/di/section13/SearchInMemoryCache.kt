package com.kotlinworld.spring.di.section13

import jakarta.annotation.PostConstruct
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
}