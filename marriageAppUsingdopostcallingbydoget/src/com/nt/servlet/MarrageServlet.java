package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarrageServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
//	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		String name=null,gender=null;
		int age=0;
		//get print writer streM
		PrintWriter pw=null;
		
		pw=res.getWriter();
		res.setContentType("text/html");
		//get request parameter
		name=req.getParameter("pname");
		gender=req.getParameter("gender");
		age=Integer.parseInt(req.getParameter("page"));
		
		if(gender.equalsIgnoreCase("M")) {
			if(age>=21)
				pw.println("<h1 style='color:green'<br><center><i>Mr. "+name+"u r eligible for marriage/man for marrage,but still think once  </br></center></i></h1>");
			else
				pw.println("<h1 style ='color:red'<br><center><i>Mr. "+name+"u r not eligible for marriage/man for marrage,feel happy  </br></center></i></h1>");
				
		}
		else {
			if(age>=18)
				pw.println("<h1 style='color:yellow'<br><center><i>Miss. "+name+"u r eligible for marriage/woman for marrage,keep u r terms and conditions  </br></center></i></h1>");
			else
				pw.println("<h1 style='color:pink'<br><center><i>Miss. "+name+"u r not eligible for marriage/woman for marrage ,feel Double happy and make other happy  </br></center></i></h1>");
		}
		pw.println("<br><a href='input.html'><img src='E:\\ServletProj\\marriageAppUsingdopostcallingbydoget\\WebContent\\2018-10-28-20-05-00-290.jpg'height=50,weight=50></a></br>");
		pw.close();
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		doGet(req,res);
	}

}
