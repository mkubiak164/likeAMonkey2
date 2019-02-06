package main;

public class Human {

    int wiek;
    int waga;
    int wzrost;
    String imie;
    Boolean isMale;

    public Human(int wiek, int waga, int wzrost, String imie, Boolean isMale) {
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
        this.imie = imie;
        this.isMale = isMale;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWaga() {
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public String getImie() {
        return imie;
    }

    public Boolean getMale() {
        return isMale;
    }

}
