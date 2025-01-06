abstract class Animal
{
     abstract void sound();
     abstract void sleep();
}
class Dog  extends Animal 
{
  	void sound()
	{
		System.out.println("bark");
	}
	void sleep()
	{
		System.out.println("5 hours ");
	}

}
class Cat extends Animal 
{
	void sound()
	{
		System.out.println("meow");
	}
	void sleep()
	{
		System.out.println("8 hours ");
	}
		
}
class Demo8{
    public static void main(String args[]){
       
		Dog d = new Dog();
		d.sound();

		Cat c = new Cat();
		c.sound();
	}
}