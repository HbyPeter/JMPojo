package com.kgc.jm.contorller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgc.jm.pojo.Cosmetics;
import com.kgc.jm.servic.CosmeticsService;

public class BaseController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String url = request.getRequestURI();
		String action = url.substring(url.lastIndexOf("/")+1,url.lastIndexOf("."));
		//·´Éä
		try {
			Class clazz = BaseController.class;
			Object obj = clazz.newInstance();
			Method method = clazz.getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(obj, request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	//ËÑË÷¿ò²éÑ¯
	public void SearchQuery(HttpServletRequest requsert,HttpServletResponse response) throws Exception{
		String name=requsert.getParameter("name");
	PrintWriter out=response.getWriter();
	CosmeticsService coss=new CosmeticsService();
	List<Cosmetics> list=coss.SearchQuery(name);
	out.write(JSON.toJSON(list).toString());
	out.close();
	}





}
