package introductory.logic;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzbuzz (100);
    }

    public static void fizzbuzz (int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
