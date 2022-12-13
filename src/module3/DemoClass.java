package module3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

public abstract class DemoClass {

    public abstract  void qa();

    public static String getCurrentDateAndTime(String timeZone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy MMM dd"+", hh");
        df.setTimeZone(TimeZone.getTimeZone(timeZone));
        String deviceDateAndTime = df.format(date);
        System.out.println("getting current date as "+deviceDateAndTime);
        return deviceDateAndTime;
    }


    public static void main(String[] args) {
        System.out.println("Demo class running");
        HashMap<String, String> customerDetails = new HashMap<>();
        for(int i=0;i<10;i++){
            String customerTag = "Tag";
            String customer = "Name"+i;

            System.out.println(("Customer tag : " +customerTag + "  CustomerName :" + customer));
            customerDetails.put(customer,customerTag);
            System.out.println(customerDetails);
        }

        DemoClass.getCurrentDateAndTime("IST");
    }
}
