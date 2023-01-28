package udemy;

public class ConvertingSecondsToDays {


/*    Converting seconds into days, hours, minutes and seconds

    Number of days =  n / (24 * 3600) ;
    Number of Hours = (n % (24 * 3600)) / 3600 ;
    Number of Minutes =  (n % (24 * 3600 * 3600)) / 60 ;
    Number of Seconds =  (n % (24 * 3600 * 3600 * 60)) / 60 ;

*/
    // function convert second into day
    // hours, minutes and seconds
    static void ConvertSectoDay(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    // Driver code
    public static void main (String[] args)
    {
        // Given n is in seconds
        int n = 129600;
        ConvertSectoDay(n);

    }
}
