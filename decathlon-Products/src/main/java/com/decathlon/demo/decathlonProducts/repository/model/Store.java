/**
 * 
 */
package com.decathlon.demo.decathlonProducts.repository.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author user
 *
 */
@Entity
@Table(name="store")
public class Store implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long storeId;
	private String storeName;
	private String storeCity;
	
	@ManyToOne
	@JoinColumn(name="productId",nullable=false)
	private Product product;
	/**
	 * @return the storeId
	 */
	public Long getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the storeCity
	 */
	public String getStoreCity() {
		return storeCity;
	}
	/**
	 * @param storeCity the storeCity to set
	 */
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
	/**
	 * @return the product
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeName=" + storeName
				+ ", storeCity=" + storeCity + ", product=" + product + "]";
	}

}
