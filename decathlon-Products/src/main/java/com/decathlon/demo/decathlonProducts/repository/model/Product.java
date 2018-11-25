/**
 * 
 */
package com.decathlon.demo.decathlonProducts.repository.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author user
 *
 */
@Entity
@Table(name="product")
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int productId;
	
	private String productName;  
	
	private String productSport ;
	
	private String productLevel ;
	
	private String productDescription ;
	
	@OneToMany(mappedBy="product")
	private Set<Store> associatedStores= new HashSet<Store>() ;
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
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
	/**
	 * @return the associatedStores
	 */
	public Set<Store> getAssociatedStores() {
		return associatedStores;
	}
	/**
	 * @param associatedStores the associatedStores to set
	 */
	public void setAssociatedStores(Set<Store> associatedStores) {
		this.associatedStores = associatedStores;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productSport=" + productSport
				+ ", productLevel=" + productLevel + ", productDescription="
				+ productDescription + ", associatedStores=" + associatedStores
				+ "]";
	}

}
