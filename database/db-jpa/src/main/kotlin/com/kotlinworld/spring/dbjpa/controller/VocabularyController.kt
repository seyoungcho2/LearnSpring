package com.kotlinworld.spring.dbjpa.controller

import com.kotlinworld.spring.dbjpa.entity.Vocabulary
import com.kotlinworld.spring.dbjpa.repository.VocabularyRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class VocabularyController(
    private val vocabularyRepository: VocabularyRepository
) {
    @GetMapping("/vocabulary")
    fun getVocabularyById(@RequestParam id: String): Vocabulary {
        return vocabularyRepository.findById(id).get()
    }

    @PostMapping("/vocabulary")
    fun addVocabulary(
        @RequestParam(required = false) id: String?,
        @RequestParam word: String,
        @RequestParam meaning: String
    ): Vocabulary {
        val vocabulary = if (id != null) {
            Vocabulary(id = id, word = word, meaning = meaning)
        } else {
            Vocabulary(word = word, meaning = meaning)
        }
        return vocabularyRepository.save(vocabulary)
    }

    @DeleteMapping
    fun deleteVocabulary(@RequestParam id: String) {
        vocabularyRepository.deleteById(id)
    }

    @GetMapping("/vocabulary/all")
    fun getAllVocabulary(): List<Vocabulary> {
        return vocabularyRepository.findAll()
    }
}