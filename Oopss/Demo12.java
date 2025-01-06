class Employee
{
	private int a;
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	void setId(int a)
	{
		this.a=a;	
	}
	int getId()
	{
		return a;
	}
	String getName()
	{
		return name;
	}
}
class Demo12
{
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.setId(100);
		e.setName("Thanesh");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
}