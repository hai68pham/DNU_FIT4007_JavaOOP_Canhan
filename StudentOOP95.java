public class StudentOOP95 {
    private String masv;  // mã sinh viên
    private String name;  // tên sinh viên
    private int age;      // tuổi

    // Constructor mặc định
    public StudentOOP95() {
    }

    // Constructor có tham số
    public StudentOOP95(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    // Getter và Setter
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Student [masv=" + masv + ", name=" + name + ", age=" + age + "]";
    }
}
