package com.abdel.stockmanagement.repositories;

import com.abdel.stockmanagement.domain.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}