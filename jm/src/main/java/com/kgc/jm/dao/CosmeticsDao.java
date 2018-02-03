package com.kgc.jm.dao;

import java.util.List;

import com.kgc.jm.pojo.Cosmetics;

public class CosmeticsDao extends BaseDao<Cosmetics> {

	//列表查询
	public List<Cosmetics> ListQuery(String brand_name,String cosmetics_class_name,String cosmetics_type,String cosmetics_function,String cosmetics_name){
		String sql ="SELECT * FROM cosmetics cos "
				+ "INNER JOIN brand ON brand.Brand_id=cos.Cosmetics_brand_id "
				+ "INNER JOIN cosmetics_class clas ON clas.Cosmetics_class_id=cos.Cosmetics_class_id	"
				+ "INNER JOIN cosmetics_details det ON det.details_id= cos.cosmetics_id	"
				+ "WHERE  brand.brand_name LIKE '%?%' "
								+ "AND 	clas.cosmetics_class_name LIKE '%?%' "
										+ "AND cosmetics_type LIKE '%?%' AND"
												+ " 	cosmetics_function LIKE '%?%' "
														+ "AND cosmetics_name LIKE '%?%' ";
		return super.Query(sql, new Object[]{brand_name,cosmetics_class_name,cosmetics_type,cosmetics_function,cosmetics_name},Cosmetics.class);
		
	}
	//搜索查询
	public List<Cosmetics> SearchQuery(String name){
		String sql="SELECT * FROM cosmetics cos "
				+ "INNER JOIN brand ON brand.Brand_id=cos.Cosmetics_brand_id "
				+ "INNER JOIN cosmetics_class clas ON clas.Cosmetics_class_id=cos.Cosmetics_class_id	"
				+ "INNER JOIN cosmetics_details det ON det.details_id= cos.cosmetics_id	"
				+ "WHERE concat(cosmetics_name,cosmetics_function,cosmetics_type,clas.cosmetics_class_name,brand.brand_name) like '%?%'";
		return super.Query(sql, new Object[]{name}, Cosmetics.class);
	}
	
}
