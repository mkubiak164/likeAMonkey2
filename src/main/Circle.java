package main;

public class Circle implements Figure {

    private double promien;

    public Circle(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    @Override
    public double getPerimeter() {
        return 2*promien*3.14;
    }

    @Override
    public double getArea() {
        return promien*promien*3.14;
    }



}
