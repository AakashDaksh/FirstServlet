package controller;
import javax.servlet.*;
import java.io.*;
public class Demo implements Servlet
{
	ServletConfig con;
	public void init(ServletConfig con)
	{
		System.out.println("Servlet Is Initialized");
	}
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String s1=req.getParameter("uname");
		pw.print("Hello "+s1);
	}
	public void destroy()
	{
		System.out.println("Servlet Object Deleted");
	}
	public ServletConfig getServletConfig()
	{
		return con;
	}
	public String getServletInfo()
	{
		return ("Created by Daksh");
	}
}