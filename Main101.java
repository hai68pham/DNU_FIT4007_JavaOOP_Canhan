

public class Main101 {
    public static void main(String[] args) {
        // Test trong cùng package
        NumberHandler103 handler = new NumberHandler103();
        handler.test();

        // Test class kế thừa khác package
        NumberChild104 child = new NumberChild104(3);
        child.testChild();

        // Test public method
        BaseNumber102 base = new BaseNumber102(10);
        System.out.println("Giá trị ban đầu: " + base.getA());
        base.setA(7);
        System.out.println("Giá trị sau khi setA(): " + base.getA());
    }
}
