package udemy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExtractString {

    public static String getCurrentDayDate(String type) {

        DateFormat df;
        if (type.equalsIgnoreCase("DATE")) {
            df = new SimpleDateFormat("MM/dd/yyyy");
            Calendar calobj = Calendar.getInstance();
            return df.format(calobj.getTime());
        } else if (type.contains("/") || type.contains("y") || type.contains("m") || type.contains("M") || type.contains("d")) {
            df = new SimpleDateFormat(type);
            Calendar calobj = Calendar.getInstance();
            return df.format(calobj.getTime());
        } else {
            Date now = new Date();
            df = new SimpleDateFormat("EEEE");
            return df.format(now);
        }
    }

    public static void main(String[] args) {

        String str = "19 weeks 4 days Based on LMP";
        String spaces = " java programming for automation ";
        String orderDetails = "Order number is 2345";


        String currentDate = getCurrentDayDate("DATE");
        String Date = currentDate.substring(3,5);
        System.out.println(Date);


        System.out.println("-------------------------------------------");

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



        String s="oraclE9.9xXpython",t="java6.7xX";
        s=s.replaceAll("[a-zA-Z]","");
        t=t.replaceAll("[a-zA-Z]","");
        System.out.println(s);
        System.out.println(t);
        System.out.println(s+t);

        Float val1=Float.parseFloat(s);
        Float val2=Float.parseFloat(t);
        System.out.println("output:"+val1+val2);
        System.out.println(val1+val2);

    }
}
