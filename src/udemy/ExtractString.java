package udemy;

public class ExtractString {

    public static void main(String[] args) {

        String str = "www.extract.com";
        String spaces = " java programming for automation ";


        String firstFour  = str.substring(0,4);
        System.out.println(firstFour);

        String betweenCharacters = str.substring(4,str.length()-4);
        System.out.println(betweenCharacters);

        String lastFour = str.substring(str.length()-4,str.length());
        System.out.println(lastFour);

        String removeSpace = spaces.trim().replace(" ","*");

        System.out.println(removeSpace);
    }
}
