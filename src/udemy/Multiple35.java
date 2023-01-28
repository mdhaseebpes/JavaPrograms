package udemy;

public class Multiple35 {
    public static void printNumber(int number) {
        for (int i = 1; i < number; i++) {
            int multiple3 = i % 3;
            int multiple5 = i % 5;
            if ((multiple3== 0) && (multiple5 == 0)) {
                System.out.println("YMLBLR");
                continue;
            }
            if (multiple3 == 0) {
                System.out.println("YML");
                continue;
            }
            if (multiple5 == 0) {
                System.out.println("BLR");
                continue;
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        printNumber(30);
    }
}
