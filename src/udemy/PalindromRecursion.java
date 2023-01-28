package udemy;

public class PalindromRecursion {

    public static boolean isPalindrome(String str)
    {
        if(str == null)
        {
            return false;
        }

        if(str.length()<=1)
        {
            return true;
        }

        String firstLetter =  str.substring(0,1);
        System.out.println(firstLetter);
        String lastLetter  = str.substring(str.length()-1, str.length());
        System.out.println(lastLetter);
        if(!firstLetter.equals(lastLetter))
        {
            return false;
        }
        else{
            return isPalindrome(str.substring(1,str.length()-1));
        }
    }

    public static void main(String[] args) {

        String str = "racecar";
        boolean check =isPalindrome(str);
        System.out.println(str + " IsPalindrome " + check);

    }
}
