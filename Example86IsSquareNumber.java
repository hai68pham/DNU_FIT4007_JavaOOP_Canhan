package part7.methods;

import java.util.Scanner;

public class Example86IsSquareNumber {
    public static boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isSquare(n) ? "YES" : "NO");
    }
}