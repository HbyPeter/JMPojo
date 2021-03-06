package com.jm.util;

import java.util.ArrayList;
import java.util.List;

public class PageUtil<T> {
	public Integer index=1;//当前页
	public Integer size=3;//每页显示条数
	public Integer totalPage;//总页数
	public Integer totalCount;//总记录数
	public List<T> list = new ArrayList<T>();//具体记录
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	

}
