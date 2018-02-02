package cn.kgc.JuMeiYouPin.pojo;
//商品表
public class Cosmetics {
	private Integer Cosmetics_id;//化妆品id
	private String  Cosmetics_name;//名称
	private Double Cosmetics_price;//价格
	private Brand Cosmetics_brand_id;//品牌id
	private Cosmetics_class Cosmetics_class_id;//类型id
	private String  Cosmetics_type;//
	private String  Cosmetics_function;
	private Integer Cosmetics_counts;
	public Integer getCosmetics_id() {
		return Cosmetics_id;
	}
	
	
	public void setCosmetics_id(Integer cosmetics_id) {
		Cosmetics_id = cosmetics_id;
	}
	public String getCosmetics_name() {
		return Cosmetics_name;
	}
	public void setCosmetics_name(String cosmetics_name) {
		Cosmetics_name = cosmetics_name;
	}
	public Double getCosmetics_price() {
		return Cosmetics_price;
	}
	public void setCosmetics_price(Double cosmetics_price) {
		Cosmetics_price = cosmetics_price;
	}
	public Brand getCosmetics_brand_id() {
		return Cosmetics_brand_id;
	}
	public void setCosmetics_brand_id(Brand cosmetics_brand_id) {
		Cosmetics_brand_id = cosmetics_brand_id;
	}
	public Cosmetics_class getCosmetics_class_id() {
		return Cosmetics_class_id;
	}
	public void setCosmetics_class_id(Cosmetics_class cosmetics_class_id) {
		Cosmetics_class_id = cosmetics_class_id;
	}
	public String getCosmetics_type() {
		return Cosmetics_type;
	}
	public void setCosmetics_type(String cosmetics_type) {
		Cosmetics_type = cosmetics_type;
	}
	public String getCosmetics_function() {
		return Cosmetics_function;
	}
	public void setCosmetics_function(String cosmetics_function) {
		Cosmetics_function = cosmetics_function;
	}
	public Integer getCosmetics_counts() {
		return Cosmetics_counts;
	}
	public void setCosmetics_counts(Integer cosmetics_counts) {
		Cosmetics_counts = cosmetics_counts;
	}
	public Cosmetics(Integer cosmetics_id, String cosmetics_name, Double cosmetics_price, Brand cosmetics_brand_id,
			Cosmetics_class cosmetics_class_id, String cosmetics_type, String cosmetics_function,
			Integer cosmetics_counts) {
		super();
		Cosmetics_id = cosmetics_id;
		Cosmetics_name = cosmetics_name;
		Cosmetics_price = cosmetics_price;
		Cosmetics_brand_id = cosmetics_brand_id;
		Cosmetics_class_id = cosmetics_class_id;
		Cosmetics_type = cosmetics_type;
		Cosmetics_function = cosmetics_function;
		Cosmetics_counts = cosmetics_counts;
	}
	public Cosmetics() {
		super();
	}
	@Override
	public String toString() {
		return "Cosmetics [Cosmetics_id=" + Cosmetics_id + ", Cosmetics_name=" + Cosmetics_name + ", Cosmetics_price="
				+ Cosmetics_price + ", Cosmetics_brand_id=" + Cosmetics_brand_id + ", Cosmetics_class_id="
				+ Cosmetics_class_id + ", Cosmetics_type=" + Cosmetics_type + ", Cosmetics_function="
				+ Cosmetics_function + ", Cosmetics_counts=" + Cosmetics_counts + "]";
	}
	
	
	
	
	
}
