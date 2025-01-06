import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID :");
		int id=sc.nextInt();		

		System.out.println("Enter Name ");
		String name =sc.next();

		System.out.println("My ID is :"+ id );
		System.out.println("My Name is :"+ name );

	}
}
