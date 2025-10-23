package part7.methods;

import java.util.Scanner;

public class Example77SumOddToN {

    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOdd(n));
    }
}