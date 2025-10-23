package part7.methods;

import java.util.Scanner;

public class Example80IsPalindromeNumber {

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "YES" : "NO");
    }
}