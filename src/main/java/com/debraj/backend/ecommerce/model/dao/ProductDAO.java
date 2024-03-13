package com.debraj.backend.ecommerce.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.debraj.backend.ecommerce.model.Product;

/**
 * Data Access Object for accessing Product data.
 */
public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
