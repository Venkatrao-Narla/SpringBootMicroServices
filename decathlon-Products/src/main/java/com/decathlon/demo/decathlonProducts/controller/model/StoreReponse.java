/**
 * 
 */
package com.decathlon.demo.decathlonProducts.controller.model;

/**
 * @author user
 *
 */
public class StoreReponse {
	
	private Long storeId;
	private String storeName;
	private String storeCity;
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

}
