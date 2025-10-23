package part7.methods;

import java.util.Scanner;

public class Example88IsPrimeDigit {
    public static boolean isPrimeDigit(int d) {
        return d == 2 || d == 3 || d == 5 || d == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        System.out.println(isPrimeDigit(d) ? "YES" : "NO");
    }
}