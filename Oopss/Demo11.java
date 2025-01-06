class Employee
{
	int a=1000;
}
class Clerk extends Employee
{
	int a=100;
	void abc(int a)
	{
		System.out.println("A :"+a);
		System.out.println("A :"+this.a);
		System.out.println("A :"+super.a);
	}

}
class Demo11
{
	public static void main(String args[])
	{
		Clerk c = new Clerk();	
		c.abc(10);	
	}
}