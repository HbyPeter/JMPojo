package com.kgc.jm.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import com.jm.util.DBHelper;
import com.kgc.jm.pojo.Brand;
import com.kgc.jm.pojo.Cosmetics;



public class BaseDao<T> {
	
	//��ѯͨ�õ��귽��
		public List<T> Query(String sql,Object[] params,Class clazz){
			List<T> list = new ArrayList<T>();
			Connection conn = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			try {
				conn = DBHelper.getConn();
				ps = conn.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
				rs = ps.executeQuery();
				//��ȡrs���������
				ResultSetMetaData data = rs.getMetaData();
				//��ȡ�������
				int count = data.getColumnCount();
				while(rs.next()){
					T t = (T) clazz.newInstance();
					for (int i = 0; i < count; i++) {
						//��ȡ����(ʵ����������)
						String column = data.getColumnName(i+1);
						//ƴ��set������
						String methodName = "set"+column.substring(0, 1).toUpperCase()+column.substring(1);
						//��ȡ����
						Field field = clazz.getDeclaredField(column);
						//��������
						Method method = clazz.getMethod(methodName, field.getType());
						//ִ�з���
						method.invoke(t, rs.getObject(column));
					}
					list.add(t);
				}
			} catch (Exception e) {
			}finally{
				DBHelper.closeAll(rs, ps, conn);
			}
			return list;
		}

		
	/*	//��ѯͨ�ö���ѯ
		public List<Brand> moreQuery(String sql,Object[] params,Class clazz){
			List<Brand> list = new ArrayList<Brand>();
			Connection conn = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			try {
				conn = DBHelper.getConn();
				ps = conn.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
				rs = ps.executeQuery();
				//��ȡ�������
				while(rs.next()){
				Cosmetics cosmetics=new Cosmetics();
				Brand brand=new Brand();
				brand.setBrand_id(rs.getInt("id"));
				brand.setBrand_name(rs.getString("name"));
				brand.setBrand_Type(rs.getString("Type"));
				cosmetics.setCosmetics_brand_id(rs.getString(""));
				
				
					list.add(t);
				}
			} catch (Exception e) {
			}finally{
				DBHelper.closeAll(rs, ps, conn);
			}
			return list;
		}

		}*/
		
		
		
		//��ѯ����
		public T getOnly(String sql,Object[] params,Class clazz){
			T t = null;
			Connection conn = null;
			ResultSet rs = null;
			PreparedStatement ps = null;
			try {
				conn = DBHelper.getConn();
				ps = conn.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
				rs = ps.executeQuery();
				//��ȡrs���������
				ResultSetMetaData data = rs.getMetaData();
				//��ȡ�������
				int count = data.getColumnCount();
				if(rs.next()){
					t = (T) clazz.newInstance();
					for (int i = 0; i < count; i++) {
						//��ȡ����(ʵ����������)
						String column = data.getColumnName(i+1);
						//ƴ��set������
						String methodName = "set"+column.substring(0, 1).toUpperCase()+column.substring(1);
						//��ȡ����
						Field field = clazz.getDeclaredField(column);
						//��������
						Method method = clazz.getMethod(methodName, field.getType());
						//ִ�з���
						method.invoke(t, rs.getObject(column));
						
					}
				}
				
			} catch (Exception e) {
			}finally{
				DBHelper.closeAll(rs, ps, conn);
			}
			
			return t;
		}
		
		//��ɾ�Ĳ�
		public void update(String sql,Object[] params, Connection conn){
			PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i+1, params[i]);
				}
				ps.executeUpdate();
			} catch (Exception e) {
			}finally{
				DBHelper.closeAll(null, ps, null);
			}
		}
}
