class A
{
	static int x=1000;
	static void abc()
	{
		System.out.println("Hi Abc method");
	}
}
class  Demo9
{
	public static void main(String args[])
	{
		//A a = new A();
		//a.abc();
		//System.out.println(a.x);
		A.abc();
		System.out.println(A.x);
				
	}
}
// static it dont belongs to obejct 
	// static var / method 
// rest everty thong we must call through obj 



