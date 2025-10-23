package part6.strings;

import java.util.Scanner;
import java.util.HashMap;

public class Example69CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : freq.keySet()) {
            System.out.println(ch + " xuất hiện " + freq.get(ch) + " lần");
        }
    }
}