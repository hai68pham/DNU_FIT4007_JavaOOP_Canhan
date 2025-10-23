


public class NumberChild104 extends BaseNumber102 {
    public NumberChild104(int a) {
        super(a);
    }

    public void testChild() {
        System.out.println("a^2 = " + sqr()); // dùng được vì sqr() là protected
    }
}
