package com.kgc.JuMeiYouPin.pojo;

public class Brand {
  private Integer brand_id;//品牌id
  private String brand_name;//品牌名称
  private String brand_Type;//品牌类型
  
public Integer getBrand_id() {
	return brand_id;
}
public void setBrand_id(Integer brand_id) {
	this.brand_id = brand_id;
}
public String getBrand_name() {
	return brand_name;
}
public void setBrand_name(String brand_name) {
	this.brand_name = brand_name;
}
public String getBrand_Type() {
	return brand_Type;
}
public void setBrand_Type(String brand_Type) {
	this.brand_Type = brand_Type;
}
public Brand(Integer brand_id, String brand_name, String brand_Type) {
	super();
	this.brand_id = brand_id;
	this.brand_name = brand_name;
	this.brand_Type = brand_Type;
}
public Brand() {
	super();
}
@Override
public String toString() {
	return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", brand_Type=" + brand_Type + "]";
}
  
}
