class Parent
{
	Parent()
	{
		System.out.println("parent class");
	}
	Parent(int a )
	{
		System.out.println("parent class int a ");
	}
}
class Child  extends Parent
{
	Child()
	{
		System.out.println("Child class ");
	}
}
class Demo2
{
	public static void main(String args[])
	{
		//Parent p = new Parent();
		Child c = new Child();
	}
}