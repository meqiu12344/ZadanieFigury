package figury;

public class Prostokat implements interfaceFigury{
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (2*a)+(2*b);
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
