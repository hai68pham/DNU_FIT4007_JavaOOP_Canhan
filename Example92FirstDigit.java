package part7.methods;

import java.util.Scanner;

public class Example92FirstDigit {
    public static int firstDigit(int n) {
        n = Math.abs(n);
        while (n >= 10) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(firstDigit(n));
    }
}