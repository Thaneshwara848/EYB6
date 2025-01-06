class  EHDemo3
{
	public static void main(String args[]) 
	{
		String name ="Thanesh";
		System.out.println(name.length());
						//name=null;NullPointerException
		System.out.println(name.length());

		int arr[]={23,4,3};
		
		System.out.println(arr[1]);//4
			//System.out.println(arr[5]); //ArrayIndexOutOfBoundsException

							String num="100A";//NumberFormatException
		String num="100";	
		int x=Integer.parseInt(num);
		System.out.println(x);
		
						//ArethematicException 
						// inputMismatchException
	}
}

Check exception ========= compile time EWxceprion 

uncheck exception -====== run time expetion 

Check  : it will check =ed by the compiler at the of compilation 
		SQL Exception IoFIleNot 

uncheck  : it will not check by tghe compiler  at time of compilation	 :AE 	NPE	NFE	AIOE		IMS