package part7.methods;

import java.util.Scanner;

public class Example72IsEven {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEven(n) ? "YES" : "NO");
    }
}