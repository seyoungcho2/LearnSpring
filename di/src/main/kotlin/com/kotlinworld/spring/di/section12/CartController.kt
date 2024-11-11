package com.kotlinworld.spring.di.section12

import org.springframework.beans.factory.ObjectProvider
import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
class CartController(
    private val cartProvider: ObjectProvider<ShoppingCart>
) {
    val shoppingCartMap: MutableMap<String, ShoppingCart> = mutableMapOf()

    fun addToCart(userId: String, item: String) {
        if (!shoppingCartMap.containsKey(userId)) {
            shoppingCartMap[userId] = cartProvider.getObject()
        }
        shoppingCartMap[userId]?.addItem(item)
        println("[Add Item] User $userId added $item to cart")
    }
}