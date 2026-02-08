package katas.main;

public class Triangle extends Figure {

    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }


    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double summary() {
        double p = (getA() + getB() + c) / 2;
        double s = p * ((p-getA()) * (p- getB()) * (p - c));
        return Math.sqrt(s);
    }
}
