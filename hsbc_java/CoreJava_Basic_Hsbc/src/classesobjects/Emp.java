package classesobjects;

public class Emp {
	
	private int empId;
	private String empName;
	private double empSal;
	
	
	
	
	  public Emp() { System.out.println("Emp 0 arg constructor called"); }
	  
	  
	  public Emp(int empId,String empName,double empSal)
	  {
		  int x=5;
		  this.empId =empId;
		  this.empName = empName;
		  this.empSal =empSal;
	  }
	 
	
	  public double calcAnnSal()
	  {
		  x = x+12;
		return this.empSal * 12;  
	  }
	  
	//String representation of your object
	public String toString()
	{
		return this.empId+","+this.empName+","+this.empSal;
	}
	
	

}
