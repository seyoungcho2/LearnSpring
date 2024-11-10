package com.kotlinworld.spring.di.section11

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ShoppingCart {
    private val items: MutableList<String> = mutableListOf()

    fun addItem(item: String) {
        items.add(item)
    }

    fun removeItem(item: String) {
        items.remove(item)
    }
}