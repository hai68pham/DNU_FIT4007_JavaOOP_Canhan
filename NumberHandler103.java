public class NumberHandler103 {
    public void test() {
        BaseNumber102 obj = new BaseNumber102(5);
        obj.inc(); // được phép vì cùng package
        obj.show();
    }
}