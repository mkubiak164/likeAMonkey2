package main;

import java.awt.*;

public class ArrayFactory {

    int x;
    private static ArrayFactory instance;

    public ArrayFactory(int x) {

        this.x = x;
    }

    private ArrayFactory() {

    }

    public static ArrayFactory getInstance() {
        if(instance == null) instance = new ArrayFactory();
        return instance;
    }

    public int[] oneDimension() {
        int[] jednowymiarowaTablica = new int[x];
        return jednowymiarowaTablica;
    }

    public int[][] twoDimension() {
        int[][] dwuwymiarowaTablica = new int[x][x];
        return dwuwymiarowaTablica;
    }

    public static void odwrotnoscLiczby(int liczba) {
        int[] tablica = new int[10];
        int j=0;

        while(liczba != 0) {
            int zmienna = liczba%10;
            tablica[j] = zmienna;
            liczba = liczba-zmienna;
            liczba = liczba/10;
            j++;
        }
        int[] tablica2 = new int[j];
        System.out.print("Odwrócona liczba to: ");
        for(int i=0; i<j; i++) {
            tablica2[i] = tablica[i];
            System.out.print(tablica2[i]);
        }
        System.out.println(" ");
    }

    public static void odwroconeSlowo(String slowo) {
        char[] stringNaZnaki = slowo.toCharArray();
        for(int i=stringNaZnaki.length-1; i>=0; i--){
            System.out.print(stringNaZnaki[i]);
        }
        System.out.println(" ");
    }

    public static void czyPalindrom(String slowo) {
        char[] slowoNaZnaki = slowo.toCharArray();
        int pomocnicza = 0;
            for(int i=0; i<slowoNaZnaki.length/2; i++){
                if(slowoNaZnaki[i] != slowoNaZnaki[slowoNaZnaki.length-1-i]) {
                    break;
                } else {
                    pomocnicza = pomocnicza+1;
                }
            }
            if(pomocnicza == slowoNaZnaki.length/2 || pomocnicza == slowoNaZnaki.length/2 - 0.5){
                System.out.println("Słowo " + slowo + " jest palindromem");
            } else {
                System.out.println("Słowo " + slowo + " nie jest palindromem");
            }
    }

    public static void macierz(int w) {
        int[][] macierz = new int[w][w];
        for(int i=0; i<w; i++){
            for(int j=0; j<w; j++){
                if(i==j) {
                    macierz[i][j] = 1;
                } else {
                    macierz[i][j] = 0;
                }
                System.out.print(macierz[i][j]);
            }
            System.out.println();
        }

    }

    public static void sortowanie(int[] tablica) {
       int licznik=tablica.length;
        do {
            licznik = 0;
            for (int i = 0; i < tablica.length - 2; i++) {
                    if (tablica[i] > tablica[i + 1]) {
                        int x = tablica[i];
                        tablica[i] = tablica[i + 1];
                        tablica[i + 1] = x;
                        licznik = licznik + 1;
                    }
                }
        } while (licznik>0);

        for(int i=0; i<tablica.length; i++) {
            System.out.print(tablica[i] + "  ");
        }
    }






}
