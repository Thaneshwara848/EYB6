class A
{
	int a;// default value for a is 0 
	A(){}
	void abc(){}// only non methids / non abstract methods 
}
class A1{}
class A2 //extends A1,A
{}
abstract class B
{
	int a;
	B(){}
	void abc(){}
	abstract void xzyz();
}
interface I
{
	int a =100;
	//int a;
	//I(){} not possible 
	void abc(); //by default all the methods are abstract and it allow only abstyarct 
}
interface J {}
interface K  extends I,J
{
}
class  Demo10
{
	public static void main(String args[])
	{
		A a = new A();
		//B b = new B();
		//I i = new I();
	}
}
