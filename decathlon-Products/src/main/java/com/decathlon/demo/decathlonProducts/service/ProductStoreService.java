/**
 * 
 */
package com.decathlon.demo.decathlonProducts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.decathlon.demo.decathlonProducts.controller.model.ProductRequest;
import com.decathlon.demo.decathlonProducts.controller.model.ProductResponse;
import com.decathlon.demo.decathlonProducts.controller.model.StoreReponse;
import com.decathlon.demo.decathlonProducts.controller.model.StoreRequest;

/**
 * @author user
 *
 */
@Service
public interface ProductStoreService {
	
	void saveProducts(ProductRequest lProductRequest);
	void saveStores(StoreRequest lStoreRequest );
	ProductResponse updateProducts(ProductRequest lProductRequest,int lProductId );
	StoreReponse updateStores(StoreRequest lStoreRequest,Long lstoreId );
	List<ProductResponse> getAllProducts();
	List<StoreReponse> getAllStores();
	List<ProductResponse> getAllProductsByStoreId(Long lstoreId);
	ProductResponse getProductByStoreIdProductId(Long lstoreId,Long lProductId);
	ProductResponse getProductById(Long lProductId);
	StoreReponse getStoreById(Long lStoreId);
}
