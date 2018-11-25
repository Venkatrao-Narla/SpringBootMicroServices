/**
 * 
 */
package com.decathlon.demo.decathlonProducts.controller;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.demo.decathlonProducts.controller.model.ProductRequest;
import com.decathlon.demo.decathlonProducts.controller.model.StoreRequest;
import com.decathlon.demo.decathlonProducts.repository.model.Product;
import com.decathlon.demo.decathlonProducts.repository.model.Store;
import com.decathlon.demo.decathlonProducts.service.ProductStoreService;

/**
 * @author user
 *
 */
@RestController
@Api
public class ProductStroeController {
	
	@Autowired
	private ProductStoreService lProductStoreService;
	
	@PostMapping(value = "/products" ,produces =
	    { MediaType.APPLICATION_JSON_UTF8_VALUE } )
    @ResponseBody ResponseEntity<String> createProduct( @RequestBody final ProductRequest lProductRequest ){
		lProductStoreService.saveProducts(lProductRequest);
		return new ResponseEntity<String>("Product Created Sucessfully",HttpStatus.CREATED);
		
	}
	@PostMapping(value = "/stores")
    ResponseEntity<String> createStore( @RequestBody final StoreRequest lStoreRequest ){
		
		lProductStoreService.saveStores(lStoreRequest);
		return new ResponseEntity<String>("Store Created Sucessfully",HttpStatus.CREATED);
		
	}
	@GetMapping(value ="/stores/{store_id}/products/{product_id}")
	ResponseEntity<Product>  getProductByStoreId(@PathVariable Long stroe_id,@PathVariable Long product_id){
		return null;
		
	}
	@GetMapping(value="/stores/{store_id}/products")
	ResponseEntity<Product> getProductsByStoreId(@PathVariable Long store_id){
		return null;
		
	}
	
	@GetMapping(value="/products")
	ResponseEntity<Product> getProducts(){
		return null;
		
	}
	
	@GetMapping(value="/products/{product_id}")
	ResponseEntity<Product> getProductById(@PathVariable Long product_id){
		return null;
		
	}
	@GetMapping(value="/stores")
	ResponseEntity<Store> getStores(){
		return null;
		
	}
	
	@GetMapping(value="/stores/{store_id}")
	ResponseEntity<Store> getStoreById(@PathVariable Long store_id){
		return null;
		
	}
	@PutMapping(value="/stores")
	ResponseEntity<Store> updateStore(@RequestParam Long store_id){
		return null;
		
	}
	@PutMapping(value="/products")
	ResponseEntity<Store> updateProduct(@RequestParam Long product_id){
		return null;
		
	}
}

