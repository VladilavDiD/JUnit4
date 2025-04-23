public class Ellipse {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }

    public double area() {
        return Math.PI * a * b;
    }

    public double perimeterApprox() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    public boolean isCircle() {
        return a == b;
    }

    public String describe() {
        return String.format("Ellipse with a = %.2f and b = %.2f", a, b);
    }
}