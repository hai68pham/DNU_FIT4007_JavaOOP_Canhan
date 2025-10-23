public class RectangleOOP96 {
    private double width;   // chiều rộng
    private double height;  // chiều dài

    // Constructor mặc định
    public RectangleOOP96() {
    }

    // Constructor có tham số
    public RectangleOOP96(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
