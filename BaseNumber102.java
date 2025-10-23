

public class BaseNumber102 {
    private int a;

    public BaseNumber102(int a) {
        this.a = a;
    }

    // chỉ dùng trong cùng package
    void inc() {
        a++;
    }

    // dùng trong cùng package và class con
    protected int sqr() {
        return a * a;
    }

    // dùng trong toàn project
    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    void show() {
        System.out.println("a = " + a);
    }

    protected int getAValue() {
        return a;
    }
}
