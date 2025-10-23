import java.util.Scanner;

public class CountWords4P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("Số từ trong chuỗi là: 0");
        } else {
            String[] tu = s.split("\\s+");
            System.out.println("Số từ trong chuỗi là: " + tu.length);
        }

        sc.close();
    }
}
