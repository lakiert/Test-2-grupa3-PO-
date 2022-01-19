package com.company;

import java.util.ArrayList;

public class Rekrutacja {

    static int doswiadczenie;
    private ArrayList<Kandydat> kandydaci;

    public static void setDoswiadczenie() {
        Rekrutacja.doswiadczenie = 2;
    }

    public static int getDoswiadczenie() {
        return doswiadczenie;
    }
}
