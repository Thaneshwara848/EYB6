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
class MTDemo2{
	public static void main(String args[]){
		A a = new A();
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		t1.start();
		t2.start();
		t1.setName("BMW");	
		t2.setName("Benz");
		for(int k=0;k<=25;k++)
		{
			try
			{
					System.out.println("	         K:"+k);
					if(k==10){ t1.suspend();}
					if(k==20){ t1.resume();}
					if(k==13){ t2.stop();}

					if(k==15){ System.out.println("BMW :"+t1.isAlive()); }
					
					if(k==18){ System.out.println("Benz :"+t2.isAlive()); }

					Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}

	}
}