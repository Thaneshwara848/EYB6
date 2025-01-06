class Emp
{
	Emp(){}
	Emp(int a){}
	Emp(int l,int b) {}
	void draw()
	{
		System.out.println("Draw ");
	}
	void draw(int r)
	{
		System.out.println("Area of Circle  :"+(2.17*r*r));
	}
	void draw(int l,int b)
	{
		System.out.println("Area of Rect :"+(l*b));
	}
}
// same method name but diff paramenter + muiltiple times + in same class = method overloding
// same Constructo name but diff paramenter + muiltiple times + in same class =COnstructor overloding
// it will be in single class : overlodibng will happens insingle class 
class  Demo4
{
	public static void main(String args[])
	{
		Emp e = new Emp();
		e.draw();
		e.draw(10);
		e.draw(10,20);
	}
}