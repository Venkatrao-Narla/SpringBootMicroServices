/**
 * 
 */
package com.decathlon.demo.decathlonProducts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decathlon.demo.decathlonProducts.controller.model.ProductRequest;
import com.decathlon.demo.decathlonProducts.controller.model.ProductResponse;
import com.decathlon.demo.decathlonProducts.controller.model.StoreReponse;
import com.decathlon.demo.decathlonProducts.controller.model.StoreRequest;
import com.decathlon.demo.decathlonProducts.repository.ProductRepository;
import com.decathlon.demo.decathlonProducts.repository.StoreRepository;
import com.decathlon.demo.decathlonProducts.repository.model.Product;
import com.decathlon.demo.decathlonProducts.repository.model.Store;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author user
 *
 */
@Service
public class ProductStoreServiceImpl implements ProductStoreService{
	
	@Autowired
	private ProductRepository lProductRepository;
	
	@Autowired
	private StoreRepository lStoreRepository;
	
	@Autowired
	private ObjectMapper lObjectMapper;
	

	@Override
	public void saveProducts(ProductRequest lProductRequest) {
		Product lProduct = lObjectMapper.convertValue(lProductRequest,
				Product.class);
		lProductRepository.saveAndFlush(lProduct);

	}

	@Override
	public void saveStores(StoreRequest lStoreRequest) {
		Store lStore = lObjectMapper.convertValue(lStoreRequest,
				Store.class);
		lStoreRepository.save(lStore);
		
	}

	@Override
	public ProductResponse updateProducts(ProductRequest lProductRequest,
			int lProductId) {
		Product lProduct = lObjectMapper.convertValue(lProductRequest,
				Product.class);
		
		/*
			Optional<Product> findById = lProductRepository.findById(lProduct.getProductId());
			if(!findById.isPresent()){
				lProductRepository.saveAndFlush(lProduct);
			}else{
				throw new RuntimeException("Id is already present in the database");
			}
	*/
		
		
		return null;
	}

	@Override
	public StoreReponse updateStores(StoreRequest lStoreRequest, Long lstoreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StoreReponse> getAllStores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductResponse> getAllProductsByStoreId(Long lstoreId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductResponse getProductByStoreIdProductId(Long lstoreId,
			Long lProductId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductResponse getProductById(Long lProductId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoreReponse getStoreById(Long lStoreId) {
		// TODO Auto-generated method stub
		return null;
	}

}
