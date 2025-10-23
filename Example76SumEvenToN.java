package part7.methods;

import java.util.Scanner;

public class Example76SumEvenToN {

    public static int sumEven(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumEven(n));
    }
}