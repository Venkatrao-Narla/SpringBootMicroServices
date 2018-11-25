/**
 * 
 */
package com.decathlon.demo.decathlonProducts.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.decathlon.demo.decathlonProducts.repository.model.Store;

/**
 * @author user
 *
 */
@Repository
public interface StoreRepository  extends CrudRepository<Store, Integer>{

}
