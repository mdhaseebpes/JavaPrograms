package Collection;

public class Employee {

    String name;
    int age;
    String dept;

    public Employee(String name, int age, String dept)
    {
        this.name = name;
        this.age =age;
        this.dept = dept;
    }

    public static void main(String[] args) {
        try
        {
            System.exit(1);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("finally after system.exit");
        }

    }
}
