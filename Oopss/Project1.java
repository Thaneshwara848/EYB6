import java.util.Scanner;
 
interface Company {
 
    void PF();
}
 
abstract class Emp {
 
    Scanner sc = new Scanner(System.in);
    int id, age, salary;
    String name, desig;
 
    Emp() {
        System.out.println("Enter ID : ");
        id = sc.nextInt();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Age : ");
        age = sc.nextInt();
    }
 
    void display() {
        System.out.println(" ID : " + id);
        System.out.println(" Name : " + name);
        System.out.println(" Age : " + age);
        System.out.println(" Salary: " + salary);
        System.out.println(" Desig : " + desig);
    }
 
    abstract void raiseSalary();
 
    abstract void bonus();
 
}
 
class Clerk extends Emp implements Company {
 
    Clerk() {
        salary = 20000;
        desig = "Clerk";
    }
 
    void raiseSalary() {
        salary = salary + 5000;
    }
 
    void bonus() {
        salary = salary + 5000;
    }
 
    public void PF() {
        System.out.println("PF for Clerk");
    }
}
 
class Dev extends Emp implements Company {
 
    Dev() {
        salary = 50000;
        desig = "Developer";
    }
 
    void raiseSalary() {
        salary = salary + 7000;
    }
 
    void bonus() {
        salary = salary + 7000;
    }
 
    public void PF() {
        System.out.println("PF for Dev");
    }
}
 
class Manager extends Emp implements Company {
 
    Manager() {
        salary = 90000;
        desig = "Manger";
    }
 
    void raiseSalary() {
        salary = salary + 15000;
    }
 
    void bonus() {
        salary = salary + 15000;
    }
 
    public void PF() {
        System.out.println("PF for Manager");
    }
}
 
class Tester extends Emp implements Company {
 
    Tester() {
        salary = 40000;
        desig = "Tester";
    }
 
    void raiseSalary() {
        salary = salary + 10000;
    }
 
    void bonus() {
        salary = salary + 10000;
    }
 
    public void PF() {
        System.out.println("PF for Tester");
    }
}
 
class Project1 {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch1, ch2 = 0;
        Manager m = null;
        Dev d = null;
        Clerk c = null;
        Tester t = null;
        do {
            System.out.println("1 ) Create  : ");
            System.out.println("2 ) Display : ");
            System.out.println("3 ) Raise Salary : ");
            System.out.println("4 ) PF : ");
            System.out.println("5 ) Exit : ");
            ch1 = sc.nextInt();
            if (ch1 == 1) {
                do {
                    System.out.println("1 ) Manager  : ");
                    System.out.println("2 ) Developer ");
                    System.out.println("3 ) Clerk  : ");
                    System.out.println("4 ) Tester ");
                    System.out.println("5 ) Exit : ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m = new Manager();
                    }
                    if (ch2 == 2) {
                        d = new Dev();
                    }
                    if (ch2 == 3) {
                        c = new Clerk();
                    }
                    if (ch2 == 4) {
                        t = new Tester();
                    }
 
                } while (ch2 != 5);
            }
            if (ch1 == 2) {
                do {
                    System.out.println("1 ) Manager  : ");
                    System.out.println("2 ) Developer ");
                    System.out.println("3 ) Clerk  : ");
                    System.out.println("4 ) Tester ");
                    System.out.println("5 ) Exit : ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m.display();
                    }
                    if (ch2 == 2) {
                        d.display();
                    }
                    if (ch2 == 3) {
                        c.display();
                    }
                    if (ch2 == 4) {
                        t.display();
                    }
 
                } while (ch2 != 5);
 
            }
            if (ch1 == 3) {
                do {
                    System.out.println("1 ) Manager  : ");
                    System.out.println("2 ) Developer ");
                    System.out.println("3 ) Clerk  : ");
                    System.out.println("4 ) Tester ");
                    System.out.println("5 ) Exit : ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m.raiseSalary();
                    }
                    if (ch2 == 2) {
                        d.raiseSalary();
                    }
                    if (ch2 == 3) {
                        c.raiseSalary();
                    }
                    if (ch2 == 4) {
                        t.raiseSalary();
                    }
                } while (ch2 != 5);
 
            }
 
            if (ch1 == 4) {
                do {
                    System.out.println("1 ) Manager  : ");
                    System.out.println("2 ) Developer ");
                    System.out.println("3 ) Clerk  : ");
                    System.out.println("4 ) Tester ");
                    System.out.println("5 ) Exit : ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) {
                        m.PF();
                    }
                    if (ch2 == 2) {
                        d.PF();
                    }
                    if (ch2 == 3) {
                        c.PF();
                    }
                    if (ch2 == 4) {
                        t.PF();
                    }
                } while (ch2 != 5);
 
            }
 
            if (ch1 == 5) {
                System.out.println("Thanks for using the Application ...!");
            }
        } while (ch1 != 5);
 
    }
}