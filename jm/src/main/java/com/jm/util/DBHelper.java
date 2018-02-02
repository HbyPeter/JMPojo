package com.jm.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
	private static String DRIVER;
	private static String URL;
	private static String USERNAME;
	private static String PASSWORD;
	static{
		try {
			//����properties�����ļ�����
			Properties prop = new Properties();
			//��������ļ�������
			InputStream in = DBHelper.class
				.getClassLoader()
					.getResourceAsStream("jdbc.properties");
			//���������ļ�
			prop.load(in);
			DRIVER = prop.getProperty("DRIVER");
			URL = prop.getProperty("URL");
			USERNAME = prop.getProperty("USERNAME");
			PASSWORD = prop.getProperty("PASSWORD");
			Class.forName(DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//��ȡ����
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void closeAll(ResultSet rs,PreparedStatement pstm,Connection conn){
		try {
			if(rs!=null){
				rs.close();
			}
			if(pstm!=null){
				pstm.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Connection conn = DBHelper.getConn();
		if(conn==null){
			System.out.println("����ʧ��");
		}else{
			System.out.println("���ӳɹ�");
		}
	}
}
