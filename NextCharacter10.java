import java.util.Scanner;

public class NextCharacter10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào một ký tự thường (từ 'a' đến 'y'): ");
        char ch = sc.next().charAt(0); // lấy ký tự người dùng nhập

        if (ch >= 'a' && ch <= 'y') {
            char nextChar = (char) (ch + 1); // ký tự liền sau
            System.out.println("Ký tự liền sau là: " + nextChar);
        } else {
            System.out.println("Ký tự nhập không hợp lệ! Hãy nhập từ 'a' đến 'y'.");
        }

        sc.close();
    }
}
