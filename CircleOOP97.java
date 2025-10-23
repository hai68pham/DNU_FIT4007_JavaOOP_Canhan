public class CircleOOP97 {
    private double radius;  // bán kính

    // Constructor mặc định
    public CircleOOP97() {
    }

    // Constructor có tham số
    public CircleOOP97(double radius) {
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
