package module3;

public class ExceptionPractice {


     //try block along finally is possible without catch block



    public void m1()
    {
        System.out.println("M1 method");
        m2();
    }

    public void m2()
    {
        System.out.println("M2 method");
        m3();
    }

    public void m3()
    {
        System.out.println("M3 method");
        int j = 4/0;

        /*try {
            int i = 9 / 0;
        }catch(ArithmeticException e)
        {
            System.out.println("Handled");

        }*/
    }


    public static int getMarks(String name) {
        if (name.equals("tom")) {
            try {
                int i = 9 / 0;
            } catch (ArithmeticException e) {
                return 22;
            } finally {
                System.out.println("Bye");
                return 66;
            }
        }
        return 44;
    }

    public static void main(String[] args)  {

        ExceptionPractice obj  = new ExceptionPractice();

        System.out.println(ExceptionPractice.getMarks("tom"));

        try {
            try {
                obj.m1();
            }catch (Exception ex){

            }
        }
        catch(ArithmeticException e )
        {
            System.out.println("Handled in main");
        }

        catch(Exception e )
        {
            System.out.println("Handled in main");
        }


        String data = " ";

        if(data.equals(" "))
        {
            try {
                throw new Exception("Search is not available");
            } catch (Exception e) {
                System.out.println("Search");

            }
        }
        System.out.println("End **");

        System.out.println("Exception related to finally block");

        System.out.println("**************");
        try{
            int  i = 9/0;
        }
        finally{
            System.out.println("possible");
        }


    }

}
