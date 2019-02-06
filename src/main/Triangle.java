package main;

import static java.lang.Math.sqrt;

public class Triangle implements Figure {

    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return sqrt(a*a + b*b) + a + b;
    }

    @Override
    public double getArea() {
        return a*b*0.5;
    }


}
