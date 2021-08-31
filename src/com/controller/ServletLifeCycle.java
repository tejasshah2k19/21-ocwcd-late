package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

	
	
	
	
	
	
	
	
	
	public ServletLifeCycle() {
		System.out.println("constructor() : ServletLifeCycle");
	}
   
	 
	 
	 
	 
	 
	 
	 
	 
	public void init() {
		// init.
		// google --> weather
		// file
		System.out.println("init() : ServletLifeCycle");
	}

	public void service(HttpServletRequest request, HttpServletResponse response) {
		// surat
		// uk
		//
		System.out.println("service() : ServletLifeCycle");
	}

	public void destroy() {
		// close
		System.out.println("destroy() : ServletLifeCycle");
	}

}
