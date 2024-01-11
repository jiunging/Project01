package com.project.food.model;

public class FoodVO {

	private String foodName;
	private String foodPrice;
	
	public FoodVO() {
		
	}

	public FoodVO(String foodName, String foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	
	

	@Override
	public String toString() {
		return "FoodVO [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	
}
