package com.company;

public class Kandydat implements Cloneable, Comparable<Kandydat>{

    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int latadoswiadczenia;


    public Kandydat(String nazwa, int wiek, String wyksztalcony, int latadoswiadczenia){
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public String getWyksztalcony() {
        return wyksztalcony;
    }

    public int getLatadoswiadczenia() {
        return latadoswiadczenia;
    }

    public int compareTo(Kandydat k){
        int comp = wyksztalcony.compareTo(k.wyksztalcony);

        if (comp > 0){
            return 1;
        }
        else if (comp < 0){
            return -1;
        }

        if (wiek > k.wiek){
            return 1;
        }
        else if (wiek < k.wiek){
            return -1;
        }

        if (latadoswiadczenia > k.latadoswiadczenia){
            return 1;
        }
        else if (latadoswiadczenia < k.latadoswiadczenia){
            return -1;
        }

        return 0;

    }


    public String toString(){
        return nazwa + ", " + wiek + "  ;   " + wyksztalcony + ", " + latadoswiadczenia;
    }

}
