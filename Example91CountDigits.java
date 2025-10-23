package part7.methods;

import java.util.Scanner;

public class Example91CountDigits {
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}