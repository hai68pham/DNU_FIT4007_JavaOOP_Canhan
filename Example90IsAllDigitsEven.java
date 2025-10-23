package part7.methods;

import java.util.Scanner;

public class Example90IsAllDigitsEven {
    public static boolean allEvenDigits(int n) {
        while (n != 0) {
            if ((n % 10) % 2 != 0) return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(allEvenDigits(n) ? "YES" : "NO");
    }
}