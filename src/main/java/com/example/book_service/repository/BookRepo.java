package com.example.book_service.repository;

import com.example.book_service.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity,Integer> {
}
