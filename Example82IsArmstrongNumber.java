package part7.methods;

import java.util.Scanner;

public class Example82IsArmstrongNumber {
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        int digits = String.valueOf(n).length();
        while (temp != 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "YES" : "NO");
    }
}