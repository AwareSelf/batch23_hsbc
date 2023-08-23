package layeredarchitecture;

import java.util.Scanner;

import layeredarchitecture.dao.EmpDaoImpl;
import layeredarchitecture.dao.EmpDaoImplCollection;
import layeredarchitecture.dao.EmpDaoIntf;
import layeredarchitecture.dao.StorageFactory;
import layeredarchitecture.model.Emp;

public class UserUI {
	
	static int id = 1; 
	EmpDaoIntf dao;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StorageFactory sf = new StorageFactory();
	//	EmpDaoIntf impl = sf.getStorage(1);
	//	UserUI ob = new UserUI(impl);
		
		UserUI ob = new UserUI(sf.getStorage(1));
		ob.acceptEmpDetailsAndStore();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee you wish to search in store:");
		int empno = sc.nextInt();
		ob.displayEmpByEmpno(empno);
		sc.close();
	}
	
	
	UserUI(EmpDaoIntf dao)
	{
		this.dao = dao;
	}
	
	void acceptEmpDetailsAndStore()
	{
		//take input from scanner for employee and
		//create emp object
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empname for emp with id:"+id+":");
		String name = sc.nextLine();
		System.out.println("enter emp salary:");
		double sal = sc.nextDouble();
		sc.nextLine();
		
		Emp e = new Emp(id,name,sal);
		boolean r = dao.save(e);
		if(r)
		{
			System.out.println("Emp added successfully");
			id++;
		}
		else
			System.out.println("There was some issue while adding Emp..");
		
		
        sc.close();
	}
	
	void displayEmpByEmpno(int empno)
	{
		Emp e = this.dao.retrieve(empno);
		
		if(e!=null)
		{
		  System.out.println(e);
		}
		else
		{
			System.out.println("Emp with given empno:"+empno+" is not there in store");
		}
	}

}//end of class
	
	

