import java.util.Scanner;
class A 
{
	int a = 100;
	A()
	{
		System.out.println("A class "+a ); 
	}
	A(int a)
	{
			System.out.println("A class int a  "); 
	
	}
}
class B   extends A
{
	B()
	{
		System.out.println("B class "+a); 
	}
}


class Demo2
{
	public static void main(String args[])
	{
		//A a = new A();
		B b = new B();
	}
}