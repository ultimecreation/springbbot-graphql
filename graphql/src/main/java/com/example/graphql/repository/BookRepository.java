package com.example.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.graphql.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
