package udemy;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = 0;
        int number1 = number;
        while (number >= 10) {
            firstDigit = (number /= 10);
        }
        lastDigit = (number1 % 10);
        if(firstDigit==0){
            firstDigit=number;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(4536));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));

        System.out.println(sumFirstAndLastDigit(-10));
    }
}
