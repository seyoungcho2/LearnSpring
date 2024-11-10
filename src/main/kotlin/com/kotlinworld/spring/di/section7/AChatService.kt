package com.kotlinworld.spring.di.section7

// 다른 라이브러리의 클래스라서 수정할 수 없다고 가정
class AChatService() {
    fun sendMessage(message: String) {
        println("Message sent: $message")
    }
}