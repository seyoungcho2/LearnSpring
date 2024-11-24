package com.kotlinworld.spring.dbjpa.repository

import com.kotlinworld.spring.dbjpa.entity.Vocabulary
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface VocabularyRepository: JpaRepository<Vocabulary, String> {
    @Query("SELECT v FROM Vocabulary v WHERE v.word LIKE %:word%")
    fun searchByWord(@Param("word") word: String): List<Vocabulary>
}