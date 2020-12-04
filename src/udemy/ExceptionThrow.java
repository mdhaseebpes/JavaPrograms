package udemy;

public class ExceptionThrow {
    void display() {
        try {
            int x=23/0;
            System.out.println("after exception");
        }catch (Exception e){
            try{
                int c=99/0;
            }catch (Exception exception){
                System.out.println("AE handled...");
            }
            throw new NullPointerException();
        }
        System.out.println("after catch");
    }
    public static void main(String[] args) {
        ExceptionThrow t=new ExceptionThrow();
        try {
            t.display();
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("ArithmeticException catch..");
        }
        System.out.println("after display");
    }
}
