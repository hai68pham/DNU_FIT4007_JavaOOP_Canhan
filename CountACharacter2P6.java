import java.util.Scanner;

public class CountACharacter2P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                dem++;
            }
        }

        System.out.println("Số ký tự 'a' trong chuỗi là: " + dem);
        sc.close();
    }
}
