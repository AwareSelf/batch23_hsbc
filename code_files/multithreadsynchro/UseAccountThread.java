package multithreadsynchro;

public class UseAccountThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ob = new Account(1,5000);
		AnotherThread2 sharedob = new AnotherThread2(ob);
		
		Thread t1 = new Thread(sharedob);
		t1.start();
		
		Thread t2 = new Thread(sharedob);
		t2.start();
		
		Thread t3 = new Thread(sharedob);
		t3.start();
		 

	}

}


class AnotherThread2 implements Runnable
{
	Account ob;
	
	AnotherThread2(Account ob)
	{
	   this.ob = ob;	
	}
	
	public void run()
	{
		
		
		for(int i=0;i<2;i++)
		{
		
		   this.ob.withdraw(1000);
		}
		
	}
}
