import java.util.Scanner;
interface Company
{
	void PF();
}
abstract class Emp
{
    Scanner sc = new Scanner(System.in);
    int id,age;
    String name;
    int salary;
    String desig ;
    Emp()
    {
        System.out.println("Enter ID : ");  id = sc.nextInt();
        System.out.println("Enter Name : ");  name = sc.next();
        System.out.println("Enter Age : ");  age = sc.nextInt();
    }
    void display()
    {
        System.out.println(" ID : "+id);
        System.out.println(" Name : "+name);
        System.out.println(" Age : "+age);
        System.out.println(" Salary: "+salary);
        System.out.println(" Desig : "+desig);
    }
    abstract void raiseSalary();
  	
}
class Clerk extends Emp implements Company
{
    int salary=25000;
    String desig="Clerk";
    Clerk()
    {
    }
void raiseSalary()
    {
        salary=salary+5000;
    }
 public void PF()
	{
	}
 }
class Dev  extends Emp
{
    int salary=50000;
    String desig="Developer";
    Dev()
    {
    }
void raiseSalary()
    {
        salary=salary+15000;
    }

}
 
class Manager  extends Emp
{
    Manager()
    {
	 salary=90000;
    	desig="Manager";
    }
	void raiseSalary()
    {
        salary=salary+25000;
    }

    
}
 
class Tester extends Emp
{
    int salary=40000;
    String desig="Tester";
    Tester()
    {
    }
	void raiseSalary()
    {
        salary=salary+10000;
    }

}
 
class Project
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch1,ch2=0;
        Manager m = null;Dev d = null; Clerk c = null; Tester t = null;
        do{
            System.out.println("1 ) Create  : ");
            System.out.println("2 ) Display ");
            System.out.println("3 ) Raise Salary : ");
            System.out.println("4 ) Exit : ");
            ch1 = sc.nextInt();
            if(ch1==1)
            {
                    do{
                        System.out.println("1 ) Manager  : ");
                        System.out.println("2 ) Developer ");
                        System.out.println("3 ) Clerk  : ");
                        System.out.println("4 ) Tester ");
                        System.out.println("5 ) Exit : ");
                        ch2 = sc.nextInt();
                        if(ch2==1){ m = new Manager();  }
                        if(ch2==2){ d = new Dev();      }
                        if(ch2==3){ c = new Clerk();    }
                        if(ch2==4){ t = new Tester();   }
                    }while(ch2!=5);
            }
            if(ch1==2)
            {
                do{
                        System.out.println("1 ) Manager  : ");
                        System.out.println("2 ) Developer ");
                        System.out.println("3 ) Clerk  : ");
                        System.out.println("4 ) Tester ");
                        System.out.println("5 ) Exit : ");
                        ch2 = sc.nextInt();
                        if(ch2==1){m.display();     }
                        if(ch2==2){d.display();     }
                        if(ch2==3){c.display();     }
                        if(ch2==4){t.display();;    }
                    }while(ch2!=5);
 
            }
            if(ch1==3)
            {
                do{
                        System.out.println("1 ) Manager  : ");
                        System.out.println("2 ) Developer ");
                        System.out.println("3 ) Clerk  : ");
                        System.out.println("4 ) Tester ");
                        System.out.println("5 ) Exit : ");
                        ch2 = sc.nextInt();
                        if(ch2==1){m.raiseSalary();     }
                        if(ch2==2){d.raiseSalary();     }
                        if(ch2==3){c.raiseSalary();     }
                        if(ch2==4){t.raiseSalary();;    }
                    }while(ch2!=5);
 
            }
            if(ch1==4)
            {
                System.out.println("Thanks for using the Application ...!");
            }
        }while(ch1!=4);
 
    }
}

