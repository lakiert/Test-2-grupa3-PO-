package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {


    public static boolean Qualified(Kandydat k){

        if (k.getLatadoswiadczenia() >= Rekrutacja.getDoswiadczenie())
        {
            return true;
        }
        else return false;

    }

    public static HashMap<Integer, String> RecruitmentMap(ArrayList<Kandydat> klist){

        HashMap<Integer, String> map = new HashMap<>();

        for (int i=0; i<klist.size(); i++)
        {
            if (Qualified(klist.get(i)))
            {
                map.put(klist.get(i).getLatadoswiadczenia(), klist.get(i).getNazwa());
            }
        }

        return map;

    }


    public static void main(String[] args) {
        

        ArrayList<Kandydat> grupa = new ArrayList<Kandydat>();

        Kandydat k1 = new Kandydat("Kowalski", 35, "licencjat", 5);
        Kandydat k2 = new Kandydat("Nowak", 35, "magisterka", 1);
        Kandydat k3 = new Kandydat("Kot", 40, "magisterka", 7);
        Kandydat k4 = new Kandydat("Mak", 30, "magisterka", 3);
        Kandydat k5 = new Kandydat("Malinowski", 28, "licencjat", 2);
        Kandydat k6 = new Kandydat("Truskawkowski", 28, "licencjat", 1);

        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);
        grupa.add(k5);
        grupa.add(k6);


        System.out.println("\n\n");


        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

        Collections.sort(grupa);
        System.out.println("\n\n");


        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }

        System.out.println("\n\n");
        Rekrutacja.setDoswiadczenie();

        System.out.println(Qualified(k3));
        System.out.println(Qualified(k2));


        System.out.println("\n\n");
        System.out.println(RecruitmentMap(grupa));


    }
}
