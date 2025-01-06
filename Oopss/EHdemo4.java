import java.util.*;
class A{
	void display(){
		for(int i=0;i<=20;i++){
			if(i==18) { throw new  NullPointerException(); }
			if(i==15) { throw new invalidAgeException("Age is Invalid bcz less the 18 "); }
			System.out.println(" I :"+i);
		}
	}
}
class  EHDemo4{
	public static void main(String args[]) {
		try{
			A a = new A();
			a.display();
		}
		catch(NullPointerException np)
		{
			System.out.println("There is somthing null in it");
	
		}
		catch(invalidAgeException iva)
		{
			System.out.println("Invalid Age  : "+iva.getMessage());
		}
	}
}
class invalidAgeException extends RuntimeException
{
	invalidAgeException(String args)
	{	
		super(args);
	}
}

Try : ifwe have risky code 
catch  : handingl code 
finally : it execute always , closing connection , file , 
thorw  : it is used to raise a exception manaually 
throws : it is used to handle the checked exception 


