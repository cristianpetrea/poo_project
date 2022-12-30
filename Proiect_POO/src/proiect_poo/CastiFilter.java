package proiect_poo;

import java.util.ArrayList;

public class CastiFilter {
    public static ArrayList<Casti> filtreazaDupaPutere(Casti[] listaCasti2, int putere) {
        ArrayList<Casti> listaCasti = new ArrayList<Casti>();
        for (Casti casti : listaCasti2)
            if (casti.getPutere() <= putere)
                listaCasti.add(casti);
        return listaCasti;
    }

    public static ArrayList<Casti> filtreazaDupaTip(Casti[] listaCasti2, String tip) {
        ArrayList<Casti> listaCasti = new ArrayList<Casti>();
        for (Casti casti : listaCasti2)
            if (casti.getTip().equals(tip))
                listaCasti.add(casti);
        return listaCasti;
    }

}