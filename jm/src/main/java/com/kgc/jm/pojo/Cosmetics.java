package com.kgc.jm.pojo;
//商品表
public class Cosmetics {
	private Integer cosmetics_id;//化妆品id
	private String  photo;//图片
	private String  cosmetics_name;//名称
	private Double cosmetics_price;//价格
	private Brand cosmetics_brand_id;//品牌id
	private Cosmetics_class cosmetics_class_id;//类型id
	private String  cosmetics_type;//商品分类
	private String  cosmetics_function;//商品功能
	private Integer cosmetics_counts;//商品数量
	private Integer collection;//收藏
	
	public Integer getCosmetics_id() {
		return cosmetics_id;
	}
	public void setCosmetics_id(Integer cosmetics_id) {
		this.cosmetics_id = cosmetics_id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCosmetics_name() {
		return cosmetics_name;
	}
	public void setCosmetics_name(String cosmetics_name) {
		this.cosmetics_name = cosmetics_name;
	}
	public Double getCosmetics_price() {
		return cosmetics_price;
	}
	public void setCosmetics_price(Double cosmetics_price) {
		this.cosmetics_price = cosmetics_price;
	}
	public Brand getCosmetics_brand_id() {
		return cosmetics_brand_id;
	}
	public void setCosmetics_brand_id(Brand cosmetics_brand_id) {
		this.cosmetics_brand_id = cosmetics_brand_id;
	}
	public Cosmetics_class getCosmetics_class_id() {
		return cosmetics_class_id;
	}
	public void setCosmetics_class_id(Cosmetics_class cosmetics_class_id) {
		this.cosmetics_class_id = cosmetics_class_id;
	}
	public String getCosmetics_type() {
		return cosmetics_type;
	}
	public void setCosmetics_type(String cosmetics_type) {
		this.cosmetics_type = cosmetics_type;
	}
	public String getCosmetics_function() {
		return cosmetics_function;
	}
	public void setCosmetics_function(String cosmetics_function) {
		this.cosmetics_function = cosmetics_function;
	}
	public Integer getCosmetics_counts() {
		return cosmetics_counts;
	}
	public void setCosmetics_counts(Integer cosmetics_counts) {
		this.cosmetics_counts = cosmetics_counts;
	}
	public Integer getCollection() {
		return collection;
	}
	public void setCollection(Integer collection) {
		this.collection = collection;
	}
	public Cosmetics(Integer cosmetics_id, String photo, String cosmetics_name, Double cosmetics_price,
			Brand cosmetics_brand_id, Cosmetics_class cosmetics_class_id, String cosmetics_type,
			String cosmetics_function, Integer cosmetics_counts, Integer collection) {
		super();
		this.cosmetics_id = cosmetics_id;
		this.photo = photo;
		this.cosmetics_name = cosmetics_name;
		this.cosmetics_price = cosmetics_price;
		this.cosmetics_brand_id = cosmetics_brand_id;
		this.cosmetics_class_id = cosmetics_class_id;
		this.cosmetics_type = cosmetics_type;
		this.cosmetics_function = cosmetics_function;
		this.cosmetics_counts = cosmetics_counts;
		this.collection = collection;
	}
	public Cosmetics() {
		super();
	}
	@Override
	public String toString() {
		return "Cosmetics [cosmetics_id=" + cosmetics_id + ", photo=" + photo + ", cosmetics_name=" + cosmetics_name
				+ ", cosmetics_price=" + cosmetics_price + ", cosmetics_brand_id=" + cosmetics_brand_id
				+ ", cosmetics_class_id=" + cosmetics_class_id + ", cosmetics_type=" + cosmetics_type
				+ ", cosmetics_function=" + cosmetics_function + ", cosmetics_counts=" + cosmetics_counts
				+ ", collection=" + collection + "]";
	}
	
	
	
	
	
	
}
