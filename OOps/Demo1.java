class Parent
{
	int money=200000;
	String car="BENZ";
	int site = 2 ;
	void display()
	{
		System.out.println("Money :"+money);
		System.out.println("Car  :"+car);
		System.out.println("Site:"+site);
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Money :"+money);
		System.out.println("Car  :"+car);
		System.out.println("Site:"+site);
	}
}
class Demo1
{
	public static void main(String args[])
	{
		Parent p = new Parent();p.display();
		Child c = new Child();c.display();
	}
}