import java.util.Scanner;

public class PangramCheck6P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine().toLowerCase();

        boolean pangram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (s.indexOf(c) == -1) {
                pangram = false;
                break;
            }
        }

        if (pangram) {
            System.out.println("Chuỗi là chuỗi pangram (chứa đầy đủ bảng chữ cái).");
        } else {
            System.out.println("Chuỗi không phải là pangram.");
        }

        sc.close();
    }
}
