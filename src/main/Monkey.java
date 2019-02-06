package main;

import javafx.scene.control.Tab;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Monkey {



    public Monkey() {
    }

    public static void main(String[] args) {
        System.out.println("Monkey 2");
        age(25);
        int age2 = age2(25);
        System.out.println(age2);
        dwieLiczby(8, 5);
        int tabelaTest[] = {3, 5, 7};
        Monkey monkey = new Monkey();
        monkey.odwroconeLiczby(tabelaTest);
        wyswietlanieLiczb(8);
        wyswietlanieLiczb2(4);
        ArrayFactory.getInstance();
        ArrayFactory.odwrotnoscLiczby(589);
        ArrayFactory.odwroconeSlowo("krewetka");
        ArrayFactory.czyPalindrom("mors");
        ArrayFactory.czyPalindrom("kajak");
        ArrayFactory.macierz(8);
        int[] abc = {1,7,2,8,3};
        ArrayFactory.sortowanie(abc);

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,6);
        Triangle triangle = new Triangle(6, 7);
        Figure figury[] = {circle, rectangle, triangle};

        for(int i=0; i<figury.length; i++) {
            System.out.println("Obwód: " + figury[i].getPerimeter() + " ");
            System.out.println("Pole: " + figury[i].getArea() + " ");
        }

    }

    public static void age(int age) {
        System.out.println(age);
    }

    public static int age2(int age2) {
        return age2;
    }

    public static void dwieLiczby (int a, int b) {
        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        System.out.println("Suma: " + suma + ", różnica: " + roznica
            + ", iloczyn: " + iloczyn);
    }

    public static boolean czyParzysta (int p) {
        int wynik = p%2;
        if(wynik == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean dzielePrzez3i5 (int f) {
        int wynikPrzez3 = f%3;
        int wynikPrzez5 = f%5;
        if(wynikPrzez3 == 0 && wynikPrzez5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int potega3 (int s) {
        return s^3;
    }

    public static boolean trojkat (int a, int b, int c) {
        double wynik = sqrt((a^2) + (b^2));
        if(wynik == c) {
            return true;
        } else {
            return false;
        }
    }

    public String[] alfabet() {
       String liter5[] = new String[5];
        String a = "a";
        liter5[0] = a;
        String[] liter55 = {"a", "b", "c", "d", "e"};

       return liter55;
    }

    public int[] odwroconeLiczby(int tabela[]) {
        for(int i=0; i<tabela.length; i++) {
            System.out.println(tabela[i]);
        }
        System.out.println("Tabela po odwróceniu: ");
        int tabela2[] = new int[3];
        if (tabela.length != 3) {
            System.out.println("Wymagana tablica 3-elementowa");
        } else {
            for(int i=0; i<3; i++ ) {
                int j = tabela.length-1;
                tabela2[i] = tabela[abs(i-j)];
                System.out.println(tabela2[i]);
            }
        }
        return tabela2;
    }

    public static void wyswietlanieLiczb(int a) {
        if((a<1) || (a%1 != 0)) {
            System.out.println("Podaj liczbę całkowitą, większą od zera");
        } else {
            System.out.println("Liczby od 0 do " + a + " to: ");
            for(int i = 0; i<=a; i++) {
                System.out.print(i + "  ");
            }
        }
        System.out.println(" ");
    }

    public static void wyswietlanieLiczb2(int a) {
        if((a<1) || (a%1 != 0)) {
            System.out.println("Podaj liczbę całkowitą, większą od zera");
        } else {
            System.out.println("Liczby od 0 do " + a + " to: ");
            int i=0;
            while (i<=a) {
                System.out.print(i + "  ");
                i++;
            }
        }
        System.out.println(" ");
    }




}