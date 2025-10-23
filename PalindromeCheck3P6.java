import java.util.Scanner;

public class PalindromeCheck3P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        String daoNguoc = new StringBuilder(s).reverse().toString();

        if (s.equalsIgnoreCase(daoNguoc)) {
            System.out.println("Chuỗi là chuỗi đối xứng (palindrome).");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
        }

        sc.close();
    }
}
