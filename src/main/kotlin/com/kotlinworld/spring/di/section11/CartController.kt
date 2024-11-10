package com.kotlinworld.spring.di.section11

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
class CartController() {
    fun addToCart(userId: String, item: String) {
        println("[Add Item] User $userId added $item to cart")
    }
}