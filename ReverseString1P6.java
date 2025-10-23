import java.util.Scanner;

public class ReverseString1P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String daoNguoc = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            daoNguoc += s.charAt(i);
        }

        System.out.println("Chuỗi đảo ngược là: " + daoNguoc);
        sc.close();
    }
}
