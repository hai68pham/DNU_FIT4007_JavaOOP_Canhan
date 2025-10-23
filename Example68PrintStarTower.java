package part6.strings;

import java.util.Scanner;

public class Example68PrintStarTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = "";
        for (int i = 0; i < n; i++) {
            line += "*";
            System.out.println(line);
        }
    }
}