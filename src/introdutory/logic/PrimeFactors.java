package introdutory.logic;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        generate(n);
    }

    public static void generate (int n) {
        for (int i = 2; n > 1; ) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }
        }
    }
}
