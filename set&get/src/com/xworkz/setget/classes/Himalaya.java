package com.xworkz.setget.classes;

public class Himalaya {
	private String ProductName = "Himalaya Facewash";
	String manufacturingBy = "Himalaya Wellness Company";
	String modelName = "Purifying Neem Face Wash";
	int quantity = 150;
	int price = 199;
	String faceWashType = "Gel";
	String ingredientType = "Organic";
	int maximumShelfLife = 36;
	String appliedFor = "Anti-acne & Pimples";
	String skinType = "All Skin Types";
	String containerType = "Tube";
	public Himalaya() {
		// TODO Auto-generated constructor stub
	}
	
	public String getProductName() {
		return ProductName;
	}
	public String getManufacturingBy() {
		return manufacturingBy;
	}
	public String getModelName() {
		return modelName;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public String getFaceWashType() {
		return faceWashType;
	}
	public String getIngredientType() {
		return ingredientType;
	}
	public int getMaximumShelfLife() {
		return maximumShelfLife;
	}
	public String getAppliedFor() {
		return appliedFor;
	}
	public String getSkinType() {
		return skinType;
	}
	public String getContainerType() {
		return containerType;
	}
	void setProductName(String productName) {
		ProductName = productName;
	}
	void setManufacturingBy(String manufacturingBy) {
		this.manufacturingBy = manufacturingBy;
	}
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void setPrice(int price) {
		this.price = price;
	}
	void setFaceWashType(String faceWashType) {
		this.faceWashType = faceWashType;
	}
	void setIngredientType(String ingredientType) {
		this.ingredientType = ingredientType;
	}
	void setMaximumShelfLife(int maximumShelfLife) {
		this.maximumShelfLife = maximumShelfLife;
	}
	void setAppliedFor(String appliedFor) {
		this.appliedFor = appliedFor;
	}
	void setSkinType(String skinType) {
		this.skinType = skinType;
	}
	void setContainerType(String containerType) {
		this.containerType = containerType;
	}

}
