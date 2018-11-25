package com.decathlon.demo.decathlonProducts.controller.model;

public class ProductRequest {
	
	private String productName;  
	
	private String productSport ;
	
	private String productLevel ;
	
	private String productDescription ;

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productSport
	 */
	public String getProductSport() {
		return productSport;
	}

	/**
	 * @param productSport the productSport to set
	 */
	public void setProductSport(String productSport) {
		this.productSport = productSport;
	}

	/**
	 * @return the productLevel
	 */
	public String getProductLevel() {
		return productLevel;
	}

	/**
	 * @param productLevel the productLevel to set
	 */
	public void setProductLevel(String productLevel) {
		this.productLevel = productLevel;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
