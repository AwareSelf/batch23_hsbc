package com.nama;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nama.model.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("SayHello servler");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		  
		double empsal = -1;
		int empid = -1;
		
		String empidstr = request.getParameter("empid");
		System.out.println("SayHello servler:empid="+empidstr);
		
		if(empidstr!=null)
		{
		   empid = Integer.parseInt(empidstr);
		}
		
		String ename = request.getParameter("empname");
		System.out.println("SayHello servler:empname="+ename);
		String empsalstr = request.getParameter("empsalary");
		System.out.println("SayHello servler:empsalary:"+empsalstr);
		
		if(empsalstr!=null)
		{
			 empsal = Double.parseDouble(empsalstr);
		}
		
		//call a business method
		boolean res = eligibleForVariablePay(empid,ename,empsal);
		String empjson = null;
		 empjson = "{\"empid\":"+ empid+",\"name\":"+ename+",\"salary\":"+empsal+"}";
		
		
		if(res)
		{
		    
		     
		    request.setAttribute("empdet",empjson);
			request.setAttribute("can_get_variable",res);
			
		}
		else
		{  
			 request.setAttribute("empdet",empjson);
				request.setAttribute("can_get_variable",res);
		}
		
		
		
		
		/*
		String welcomemsg = "Happy Diwali..";
		String result = greetUser(ename,welcomemsg);
		request.setAttribute("greet", result);
		*/
		
		/*
		PrintWriter pw = response.getWriter();
		
		pw.println(" Hello "+ename);
		pw.close();//set the data inside request object as an attribute
		
		
		*/
		
		
		
		//forwarding the request to servlet
		
		//RequestDispatcher rd  = getServletContext().getRequestDispatcher("/showEmp.jsp");
		
		RequestDispatcher rd  = getServletContext().getRequestDispatcher("/empvariablepay.jsp");
		
		 rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//business method
	String greetUser(String name,String welcomemsg)
	{
		//ideally it should create instance of model and call some method on it to get data
		//then process it and return it from this business logic method
	    return welcomemsg +" "+name;	
	}
	
	//business method
	boolean eligibleForVariablePay(int empid,String ename,double salary)
	{
		//access a model class and create object and call methods on it to get the data
		Employee e = new Employee(empid,ename,salary);
		
		double annsal = e.calcAnnSalary();
		
		if(annsal > 500000)
		{
		   	return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
