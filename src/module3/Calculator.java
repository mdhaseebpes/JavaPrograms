package module3;

public class Calculator {
    private int result;

    public Calculator add(int num) {
        this.result += num;
        return this; // Returning the current object
    }

    public Calculator subtract(int num) {
        this.result -= num;
        return this; // Returning the current object
    }

    public int getResult() {
        return this.result;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5).subtract(2).getResult();
        System.out.println("Result: " + result);
    }

}
