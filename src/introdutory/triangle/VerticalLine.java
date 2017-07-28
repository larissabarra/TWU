package introdutory.triangle;

import java.util.Scanner;

public class VerticalLine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter the length of the line: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
