package com.kotlinworld.spring.di.section12

import org.springframework.beans.factory.ObjectProvider
import org.springframework.stereotype.Component

@Component
class CartControllerProvider(
    private val cartControllerProvider: ObjectProvider<CartController>
) {
    fun provideCartController(): CartController {
        return cartControllerProvider.getObject()
    }
}