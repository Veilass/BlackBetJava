package JUnit;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.add(10,5));
        System.out.println("10 + 15 = " + calculator.add(10,15));
    }
}
