package com.debraj.backend.ecommerce.model.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.debraj.backend.ecommerce.model.Address;

import java.util.List;

/**
 * Data Access Object for the Address data.
 */
public interface AddressDAO extends ListCrudRepository<Address, Long> {

  List<Address> findByUser_Id(Long id);

}
