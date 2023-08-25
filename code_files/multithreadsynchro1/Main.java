package multithreadsynchro1;
public class Main {

	public static void main(String[] args) {
		
		AccountThread ob =  new AccountThread(new Account1(1,1000));
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
	}

}


class AccountThread implements Runnable
{
	Account1 acct;
	
	AccountThread(Account1 acct)
	{
		this.acct = acct;
	}
	public void run()
	{
		this.acct.withdraw(800);
		
	}
}