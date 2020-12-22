package udemy;

public class ExtractString {

    public static void main(String[] args) {

        String str = "19 weeks 4 days Based on LMP";
        String spaces = " java programming for automation ";
        String orderDetails = "Order number is 2345";


        String firstFour  = str.substring(0,3);
        System.out.println(firstFour);

        String betweenCharacters = str.substring(4,str.length()-4);
        System.out.println(betweenCharacters);

        String lastFour = str.substring(str.length()-12,str.length());
        System.out.println(lastFour);

        String removeSpace = spaces.trim().replace(" ","*");

        System.out.println(removeSpace);

        System.out.println(orderDetails.substring(orderDetails.indexOf("is")+3, orderDetails.length()));

        //split
        System.out.println("***Split*************");
        String test = "Java;Python;C;JavaScript";
        String[] add = test.split(";");
        for (String e : add) {
            System.out.println(e);
        }

        String data = "xXtestingXxXxJavaxXselenium";

        String d1[] = data.split("xX");
        for(String a: d1)
        {
            System.out.println(a);
        }

        System.out.println("****String concat*****");
        String x = "100";
        System.out.println(x+20); //10020
        //converting String to int
        int i= Integer.parseInt(x);
        System.out.println(i+20);

        //converting back int to String
       String j = String.valueOf(i);
        System.out.println(j+30);


    }
}
