
//final class Bank id class is final we cant inherite 
// method : we cant over ride 
// var we cant re assign 
class Bank
{
	final int pin =0000 ;
	private String card="Debit";
	String type="Visa";
	//public final  void ROI() we cant over ride final method
	public  void ROI()
	{
		System.out.println("10% ROI ");
	}
	void xyz(){}
	void aa(){}
}
class Sbi extends Bank
{
	public void ROI()
	{
		System.out.println("12% ROI ");
		System.out.println("Card" +card);
		System.out.println("Type "+type);
	}		
}

class  Demo6
{
	public static void main(String args[])
	{
		Sbi s = new Sbi();
		s.ROI();
		System.out.println("Pin "+s.pin);
		//s.pin=2222; we cant re assign if its a final variable 		
		System.out.println("Modified Pin "+s.pin);

	}
}





