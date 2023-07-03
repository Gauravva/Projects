package com.jspiders.car_dekho_case_study.entity;
import com.jspiders.car_dekho_case_study.operation.CarDekhOperation ;

public class Car {
	private int car_id;
	private String cname;
	private String model;
	private String brand;
	private String fuel_type;
	private double price;
	
   public Car(int car_id,String cname,String model,String brand,String fuel_type,double price)
	{
		this.car_id=car_id;
		this.cname=cname;
		this.model=model;
		this.brand=brand;
		this.fuel_type=fuel_type;
		this.price=price;
	}
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	
	public String getCarName() {
		return cname;
	}
	public void setCarName(String cname) {
		this.cname=cname;
	}
	public String getCModel() {
		return model;
	}
	public void SetCModel(String model) {
		this.model=model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
public String toString()
{
	return   "Car_Id: "+car_id 
			+"\nCarName:" +cname
			+"\nModel_Name: " +model
			+"\nBrand_Name: " +brand
			+"\nFuel_Type: "+fuel_type
			+"\nCar_Price: "+price;
	}	


	
}
	
	

