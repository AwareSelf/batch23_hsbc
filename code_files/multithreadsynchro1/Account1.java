package multithreadsynchro1;
public class Account1  {
	
	private int acctid;
	private double bal;
	
	
	public Account1(int acctid,double bal)
	{
		this.acctid=acctid;
		this.bal=bal;
	}
	
	//setter and getters
	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		
		if(bal>0)
		{
		  this.bal = bal;
		}
	}

	public int getAcctid() {
		return acctid;
	}

	public double deposit(int amt)
	{
		this.bal =  this.bal + amt;
		 return this.bal;
	}
	
	
	
	
	
	public  void withdraw(int amt)
	{
		
		
	//	synchronized(this)
		{
		if(this.bal > amt)
		{
			System.out.println("inside withdraw inside if block:"+Thread.currentThread().getName()+" current bal:"+this.bal);
			try
			{
			Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		
			
			this.bal =  this.bal - amt;
			System.out.println(Thread.currentThread().getName()+", after deducting:"+this.bal);
		
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+", insufficient balance:"+this.bal);
		}
		
		  
		}
		
	}
	
	
	


}
