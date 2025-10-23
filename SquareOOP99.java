public class SquareOOP99 {
    private double side;  // cạnh hình vuông

    // Constructor mặc định
    public SquareOOP99() {
    }

    // Constructor có tham số
    public SquareOOP99(double side) {
        this.side = side;
    }

    // Getter và Setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
