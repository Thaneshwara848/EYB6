abstract class A
{
	abstract void abc();
}
abstract class B  extends A
{
	void abc()
	{
		System.out.println("Abc mthods ");
	}
	abstract  public void xyz();
}
class C extends B
{
	public void xyz(){
	}
}
class  Demo7
{
	public static void main(String args[])
	{
		// we cant create obj abstratc class 
		// A method : if the mothd contain abstrct key wpordk : am 
		// class 
		// it used to hide implemention 
		// we override in child class 
		// Abstacrt clas will 0 -100% 
	}
}



