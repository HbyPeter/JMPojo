package com.kgc.jm.servic;

import java.util.List;

import com.kgc.jm.dao.CosmeticsDao;
import com.kgc.jm.pojo.Cosmetics;

public class CosmeticsService {

	private CosmeticsDao dao=new CosmeticsDao();

	public CosmeticsDao getDao() {
		return dao;
	}

	public void setDao(CosmeticsDao dao) {
		this.dao = dao;
	}
	
	
	//搜索款查询
	public List<Cosmetics> SearchQuery(String name){
		return dao.SearchQuery(name);
	}
	//列表查询
	public List<Cosmetics>	ListQuery(String brand_name,String cosmetics_class_name,String cosmetics_type,String cosmetics_function,String cosmetics_name){
		return dao.ListQuery(brand_name, cosmetics_class_name, cosmetics_type, cosmetics_function, cosmetics_name);
	
	}
	
}
