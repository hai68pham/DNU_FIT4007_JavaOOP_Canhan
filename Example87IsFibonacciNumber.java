package part7.methods;

import java.util.Scanner;

public class Example87IsFibonacciNumber {
    public static boolean isFibo(int n) {
        return isSquare(5 * n * n + 4) || isSquare(5 * n * n - 4);
    }

    public static boolean isSquare(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isFibo(n) ? "YES" : "NO");
    }
}