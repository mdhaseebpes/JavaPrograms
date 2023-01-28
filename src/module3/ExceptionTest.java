package module3;

public class ExceptionTest {

    String useCardOnFileFormat;
    static String useCardOnFileFormat1;
    static int show(){
        try{
            int i= 5/0;
            return 1;
        }catch(Exception e){
            return 2;
        }finally {
            return 3;
        }

    }

    public static void main(String[] args) {
        int result =show();
        System.out.println(result);
        ExceptionTest e = new ExceptionTest();

        useCardOnFileFormat1 = "";
        System.out.println(e.useCardOnFileFormat);

        System.out.println(useCardOnFileFormat1);

        try{

        }catch(Exception ex){

        }


        try{
            int  i = 9/0;
        } finally{
       System.out.println("possible");
                    }
    }
}
