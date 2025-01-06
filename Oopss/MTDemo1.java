class A extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++){
			try{
			System.out.println("I :"+i);
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class B extends Thread{
	public void run()
	{
		for(int j=0;j<=10;j++){
			try{
			System.out.println("	J :"+j);
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class C extends Thread{
	public void run()
	{
		for(int j=0;j<=10;j++){
			try{
			System.out.println("		K:"+j);
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){}
		}
	}
}
class MTDemo1{
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		C  c= new C();
		b.start();
		a.start();
		c.start();
	}
}