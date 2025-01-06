class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=25;i++)
		{
			try
			{
				if(Thread.currentThread().getName().equals("BMW"))
				{
					System.out.println(Thread.currentThread().getName()+":"+i);
				}
				if(Thread.currentThread().getName().equals("Benz"))
				{
					System.out.println("	"+Thread.currentThread().getName()+":"+i);
				}
				Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class MTDemo3{
	public static void main(String args[]){
		A a = new A();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		t1.start();
		t2.start();
		t1.setName("BMW");	
		t2.setName("Benz");
		System.out.println(t1);
		System.out.println(t2);
		t1.setPriority(10);	
		t2.setPriority(3);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}
}


