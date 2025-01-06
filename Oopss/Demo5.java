
class Bank
{
	public void ROI()
	{
		System.out.println("10% ROI ");
	}
}
class Sbi extends Bank
{
		
}
class Axis extends Bank
{
	public void ROI()
	{
		System.out.println("12% ROI ");
	}
}
// same method name same signature same paramter but in sub  class = method overriding
//COnstructor cant be  overriden
// it will be in sub class : overrindibng will happens in child  class 
class  Demo5
{
	public static void main(String args[])
	{
		Bank b = new Bank();
		b.ROI();

		Sbi s = new Sbi();
		s.ROI();

		Axis a = new Axis();
		a.ROI();	
	}
}