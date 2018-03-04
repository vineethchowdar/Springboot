package com.app.item.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "item")
public class Item {
	
	@Column(name="clientId")
	private int clientId;
	
	@Id
	@Column(name="itemId")
	private String itemId;
	
	@Column(name="productId")
	private String productId;
	
	@Column(name="brandId")
	private String brandId;
	
	@Column(name="clientItemId")
	private int clientItemId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="productTitle")
	private String productTitle;
	
	@Column(name="description")
	private String description;
	
	@Column(name="color")
	private String color;

	public Item() {
	}

	public Item(int clientId, String itemId, String productId, String brandId, int clientItemId, String status,
			String productTitle, String description, String color) {
		super();
		this.clientId = clientId;
		this.itemId = itemId;
		this.productId = productId;
		this.brandId = brandId;
		this.clientItemId = clientItemId;
		this.status = status;
		this.productTitle = productTitle;
		this.description = description;
		this.color = color;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public int getClientItemId() {
		return clientItemId;
	}

	public void setClientItemId(int clientItemId) {
		this.clientItemId = clientItemId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
