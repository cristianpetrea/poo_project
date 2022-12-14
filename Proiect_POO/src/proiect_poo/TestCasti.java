package proiect_poo;

public class TestCasti {
    public static void main(String[] args) {
        System.out.println("Testare Proiect");

        // instantierea un obiect de tip Gadget
        // prin apel constructor implicit ( fara parametrii)

        Gadget gadegtMeu = new Gadget();
        gadegtMeu.AfisarePret();
        gadegtMeu.AfisareStoc();

        // initierea unui obiect de tip Casti
        // prin apel constructor cu parametrii

        Casti castileMele = new Casti("Samsung", "negru", "nou", 2, 299.99f,
                12, "Office", "Bluetooth", true, 10);
        castileMele.AfisarePret();
        castileMele.AfisareStoc();

        // initierea unui nou obiect de tip casti
        // prin apel constructorul de copiere

        Casti castileMele2 = new Casti(castileMele);
        castileMele2.AfisarePret();
        castileMele2.AfisareStoc();

        // folosirea metodelor get si set.

        castileMele.setPutere(15);
        System.out.println("Puterea castilor este: " + castileMele.getPutere());

        // folosirea metodei toString()

        System.out.println(castileMele2);
        System.out.println("Castile mele sunt: " + castileMele.toString());

        // ------------------Testare Proiect------------------

        Casti[] listaCasti = GeneratorCasti.genereazaNisteCasti(10);

        /*
         * for (int i = 0; i < listaCasti.length; i++) {
         * System.out.println(listaCasti[i]);
         * }
         */
        System.out.println("Lista castilor este: ");
        for (Casti casti : listaCasti) {
            System.out.println(casti);
        }

    }
}
