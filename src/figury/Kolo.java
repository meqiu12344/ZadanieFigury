package figury;

public class Kolo implements interfaceFigury{

    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2*3.1415*r;
    }

    public double getArea() {
        return 3.14*Math.pow(r, 2);
    }
}
