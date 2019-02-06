package main;

import static java.lang.Math.sqrt;

public class Prostokat {

    double dlugosc;
    double szerokosc;

    public double obliczPole() {
        return dlugosc*szerokosc;
    }

    public double obliczObwod() {
        return ((2*dlugosc) + (2*szerokosc));
    }

    public double obliczDlugoscPrzekatnej() {
        return sqrt((dlugosc*dlugosc) + (szerokosc*szerokosc));
    }




}
