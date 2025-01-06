import java.util.Scanner;
class A
{
	int id;
	String name;
	A()	
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID :");
		 id=sc.nextInt();		

		System.out.println("Enter Name ");
		 name =sc.next();
	}
	void display()
	{
		System.out.println("My ID is :"+ id );
		System.out.println("My Name is :"+ name );
	}	
}
class Demo3
{
	public static void main(String args[])
	{
		System.out.println("HI Demo 3 class");
		A a = new A();
	
		A a1 = new A();
	}
}

























