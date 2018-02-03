package com.kgc.jm.pojo;

public class Cosmetics_class {
private Integer Cosmetics_class_id;//分类id
private String Cosmetics_class_name;//分类名称
private Cosmetics cosmetics;

public Cosmetics getCosmetics() {
	return cosmetics;
}

public void setCosmetics(Cosmetics cosmetics) {
	this.cosmetics = cosmetics;
}

public Integer getCosmetics_class_id() {
	return Cosmetics_class_id;
}

public void setCosmetics_class_id(Integer cosmetics_class_id) {
	Cosmetics_class_id = cosmetics_class_id;
}
public String getCosmetics_class_name() {
	return Cosmetics_class_name;
}
public void setCosmetics_class_name(String cosmetics_class_name) {
	Cosmetics_class_name = cosmetics_class_name;
}

public Cosmetics_class(Integer cosmetics_class_id, String cosmetics_class_name, Cosmetics cosmetics) {
	super();
	Cosmetics_class_id = cosmetics_class_id;
	Cosmetics_class_name = cosmetics_class_name;
	this.cosmetics = cosmetics;
}

public Cosmetics_class() {
	super();
}

@Override
public String toString() {
	return "Cosmetics_class [Cosmetics_class_id=" + Cosmetics_class_id + ", Cosmetics_class_name="
			+ Cosmetics_class_name + ", cosmetics=" + cosmetics + "]";
}

	
}
