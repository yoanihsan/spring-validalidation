package com.teten.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teten.entity.Book;

/**
 *
 * @author gecko
 */
public interface BookRepository extends JpaRepository<Book,Integer>{
    List<Book> findByName(String name);
}