package DataStructuresAlgorithms.Introduction;

import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeComplexity {

    public static void main(String[] args) {
        //Time complexity quantifies the amount of space,time and memory by the algorthim as function its input
        // o - worst case- o(n) , sigma - Average case - sigma(n)
        //

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh_mm");
        LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dtf.format(dateTime));

        System.out.println(RandomStringUtils.randomNumeric(5));

        System.out.println(123_34);


    }
}
