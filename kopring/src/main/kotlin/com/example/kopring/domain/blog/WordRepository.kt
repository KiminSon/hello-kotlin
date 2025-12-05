package com.example.kopring.domain.blog

import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<Wordcount, String> {
    fun findTop10ByOrderByCntDesc(): List<Wordcount>
}
