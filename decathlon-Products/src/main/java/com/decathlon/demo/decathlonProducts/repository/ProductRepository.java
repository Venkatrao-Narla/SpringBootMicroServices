/**
 * 
 */
package com.decathlon.demo.decathlonProducts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decathlon.demo.decathlonProducts.repository.model.Product;

/**
 * @author user
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
