package com.dudu.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudu.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
