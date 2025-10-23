package part7.methods;

import java.util.Scanner;

public class Example89SumPrimeDigits {
    public static int sumPrimeDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            if (isPrimeDigit(d)) sum += d;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrimeDigit(int d) {
        return d == 2 || d == 3 || d == 5 || d == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumPrimeDigits(n));
    }
}