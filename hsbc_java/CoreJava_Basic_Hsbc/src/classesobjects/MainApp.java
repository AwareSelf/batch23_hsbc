package classesobjects;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e;  //declaring a reference
		e = new Emp(); //creating a object
		
		
		System.out.println(e);
		
		Emp e1 = new Emp(1,"Ram",1600);
		System.out.println(e1);  // e1.toString();
		System.out.println(e1.calcAnnSal());
		
		double annSal = e1.calcAnnSal();
		System.out.println("ann sal of emp e1:"+annSal);
		
		
		
		
		Emp e2 = new Emp(2,"Shyam",2600);
		System.out.println(e2);
	    System.out.println(e2.calcAnnSal());
		
		annSal = e2.calcAnnSal();
		System.out.println("ann sal of emp e2:"+annSal);
		
        e1 = e2;
	}

}
