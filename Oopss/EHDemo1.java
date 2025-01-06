import java.util.*;
class  EHDemo1
{
	public static void main(String args[]){
		m1();
	}
	static void m1(){
		m2();
		System.out.println("Hi M1");
	}
	static void m2(){
		m3();
		System.out.println("Hi M2");
	}
	static void m3(){
		try{
			System.out.println("Hi m3");
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter A  :");int a= sc.nextInt();
			System.out.println("ENter B  :");int b= sc.nextInt();
			int res= a/b;		
			System.out.println("Result  : "+res);
		}
		catch(InputMismatchException ime){
			System.out.println("Hi Boss please enter the number only");
		}
		catch(ArithmeticException ae){
				System.out.println("Hi Bos you cant devide anything by 0 ");
		}
		finally
		{
			System.out.println("Thank you ");
		}
	}
}