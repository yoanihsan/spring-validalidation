package com.teten.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teten.entity.BookCategory;

/**
 *
 * @author gecko
 */
@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
    
}
