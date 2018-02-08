package com.oopsmails.springboot.kotlin.sandbox.repository

import com.oopsmails.springboot.kotlin.sandbox.entity.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long>
