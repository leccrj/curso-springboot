package com.dudu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
