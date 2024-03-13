package com.debraj.backend.ecommerce.service;

import org.springframework.stereotype.Service;

import com.debraj.backend.ecommerce.model.Product;
import com.debraj.backend.ecommerce.model.dao.ProductDAO;

import java.util.List;

/**
 * Service for handling product actions.
 */
@Service
public class ProductService {

  /** The Product DAO. */
  private ProductDAO productDAO;

  /**
   * Constructor for spring injection.
   * @param productDAO
   */
  public ProductService(ProductDAO productDAO) {
    this.productDAO = productDAO;
  }

  /**
   * Gets the all products available.
   * @return The list of products.
   */
  public List<Product> getProducts() {
    return productDAO.findAll();
  }

}
