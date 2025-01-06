import java.io.*;
class  EhDemo2
{
	public static void main(String args[]) throws FileNotFoundException
	{
		m1();
	}
	static void m1() throws FileNotFoundException
	{
		m2();
		System.out.println("Hi M1");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("Hi M2");
	}
	static void m3() throws FileNotFoundException
	{
		File f = new File("abc.txt");
		FileReader fr= new FileReader(f);
	}
}
