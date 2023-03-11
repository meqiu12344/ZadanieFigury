package figury;

public class Trojkat implements interfaceFigury{

    private double a;
    private double b;

    public Trojkat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        double c =  Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);

        return a + b + c;
    }

    @Override
    public double getArea() {
        return (b*a)/2;
    }
}
