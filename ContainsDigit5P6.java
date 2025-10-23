import java.util.Scanner;

public class ContainsDigit5P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        boolean coSo = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                coSo = true;
                break;
            }
        }

        if (coSo) {
            System.out.println("Chuỗi có chứa ít nhất một ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số nào.");
        }

        sc.close();
    }
}
