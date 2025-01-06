import java.util.Scanner;
class Emp
{
	int id ;
	String name ;
	int age;
	Scanner sc = new Scanner(System.in);
	Emp()
	{
		System.out.print("ID "); id= sc.nextInt();
		System.out.print("Name "); name= sc.next();
		System.out.print("Age  "); age= sc.nextInt();
	}
}
class Clerk extends Emp
{
	
	int salary =25000;
	String desig="Clerk";
	
	Clerk()
	{
	}
	void display()
	{
		System.out.println("ID "+id);
		System.out.println("Name  "+name);
		System.out.println("Age  "+age);
		System.out.println("Salary "+salary);
		System.out.println("Desig "+desig);
	}
}
class Dev extends Emp

{
	int salary =50000;
	String desig="Developer";
	
	Dev()
	{	
	}
	void display()
	{
		System.out.println("ID "+id);
		System.out.println("Name  "+name);
		System.out.println("Age  "+age);
		System.out.println("Salary "+salary);
		System.out.println("Desig "+desig);
	}

}
class Tester extends Emp

{
	int salary =40000;
	String desig="Tester";
	Scanner sc = new Scanner(System.in);
	Tester()
	{
	}
	void display()
	{
		System.out.println("ID "+id);
		System.out.println("Name  "+name);
		System.out.println("Age  "+age);
		System.out.println("Salary "+salary);
		System.out.println("Desig "+desig);
	}

}
class Manager extends Emp
{
	int salary =90000;
	String desig="Manager";
	Scanner sc = new Scanner(System.in);
	Manager()
	{
	}
	void display()
	{
		System.out.println("ID "+id);
		System.out.println("Name  "+name);
		System.out.println("Age  "+age);
		System.out.println("Salary "+salary);
		System.out.println("Desig "+desig);
	}

}
class project
{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int ch1,ch2=0;
		Manager m = null; Dev d = null;
		do{
			System.out.println("1 ) Create ");
			System.out.println("2 ) Display ");
			ch1=sc.nextInt();
			if(ch1==1){
				do{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit");
					ch2=sc.nextInt();
					if(ch2==1){
						 m = new Manager();
					}
					if(ch2==2){
						 d = new Dev();
					}

				}while(ch2!=5);
			}
			if(ch1==2){
				do{
					System.out.println("1 ) Manager ");
					System.out.println("2 ) Developer ");
					System.out.println("3 ) Tester ");
					System.out.println("4 ) Clerk ");
					System.out.println("5 ) Exit");
					ch2=sc.nextInt();
					if(ch2==1){
						m.display();
					}
					if(ch2==2){
						d.display();
					}

				}while(ch2!=5);

			}
		}
		while(ch1!=2);


































	}
}