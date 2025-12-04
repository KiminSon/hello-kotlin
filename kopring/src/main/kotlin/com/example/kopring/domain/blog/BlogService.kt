package com.example.kopring.domain.blog

import com.example.kopring.domain.blog.dto.BlogDto
import org.springframework.stereotype.Service

@Service
class BlogService {
    fun searKakao(blogDto: BlogDto): String? {
        println(blogDto.toString())
        return "SearchKakao"
    }
}
