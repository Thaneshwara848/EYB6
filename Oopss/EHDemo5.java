import java.util.*;
class  EHDemo5{
	public static void main(String args[]) {
		try{
			try
			{
			}
			catch(Exception e)
			{
			}
		}	
		catch(NullPointerException np){
			System.out.println("There is somthing null in it");
		}
		catch(Exception e){
			try
			{
			}
			finally
			{
			}
		}
		finally
		{
			try
			{
			}
			catch(Exception e)
			{
			}
			finally
			{
			}
		}
	}
}




