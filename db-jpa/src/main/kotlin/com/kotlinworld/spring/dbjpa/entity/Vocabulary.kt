package com.kotlinworld.spring.dbjpa.entity

import jakarta.persistence.*
import java.util.*

// @Entity(name = "Voca") // Entity명 지정도 가능
@Entity
@Table(name = "vocabulary", indexes = [Index(name = "idx_word", columnList = "word")])
data class Vocabulary(
    @Id
    val id: String = UUID.randomUUID().toString(),
    val word: String,
//    @Column(name = "mean") // Column명 지정도 가능
    val meaning: String
)