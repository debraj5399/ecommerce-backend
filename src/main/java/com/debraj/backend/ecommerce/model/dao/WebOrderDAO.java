package com.debraj.backend.ecommerce.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.debraj.backend.ecommerce.model.LocalUser;
import com.debraj.backend.ecommerce.model.WebOrder;

import java.util.List;

/**
 * Data Access Object to access WebOrder data.
 */
public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

  List<WebOrder> findByUser(LocalUser user);

}
