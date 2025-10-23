package part7.methods;

import java.util.Scanner;

public class Example93LastDigit {
    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastDigit(n));
    }
}