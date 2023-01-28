package module4;

class Employee{
     int empno;
     String name;
     float sal;

     Employee()
     {
         System.out.println("*******");

     }

     Employee(int empno , String name)
     {
         System.out.println("*******");
         this.empno = empno;
        this.name = name;

     }

    Employee(int empno , String name,float sal)
    {
        System.out.println("*******");
        this.empno = empno;
        this.name = name;
        this.sal = sal;
    }

    void displayDetails(){
        System.out.println( empno + "|" + name + "|" + sal);
    }
}

public class ConstructorTest {

    public static void main(String[] args) {

        Employee emp = new Employee();
        Employee emp1 = new Employee(101,"Aliza");
        Employee emp2 = new Employee(102, "Fathima",5000000);

        emp.displayDetails();
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
