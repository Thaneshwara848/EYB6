class A extends Thread
{
	public synchronized void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				if(Thread.currentThread().getName().equals("Rama"))
				{
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				if(Thread.currentThread().getName().equals("Seetha"))
				{
					System.out.println("	"+Thread.currentThread().getName()+":"+i);
				}
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class MTDemo4{
	public static void main(String args[]){
		A a = new A();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		t1.start();
		t2.start();
		t1.setName("Rama");	
		t2.setName("Seetha");
		
	}
}