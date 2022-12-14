package proiect_poo;

public class GeneratorCasti {
    static private String[] brand = { "Samsung", "Apple", "Sony", "Huawei", "Xiaomi", "LG", "Lenovo", "Microsoft" };

    static private String[] culoare = { "Negru", "Alb", "Rosu", "Verde", "Albastru", "Galben", "Portocaliu", "Gri" };

    static private String[] stare = { "Nou", "Vechi" };

    static private int[] garantie = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private float[] pret = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

    static private int[] stoc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private String[] tip = { "Office", "Gaming", "Sport" };

    static private String[] functii = { "Bluetooth", "Wired", "Wireless" };

    static private boolean[] microfon = { true, false };

    static private int[] putere = { 5, 10, 15, 20 };

    public static Casti[] genereazaNisteCasti(int n) {
        Casti[] listaCasti = new Casti[n];
        for (int i = 0; i < n; i++) {
            String brandCasti = brand[(int) (Math.random() * brand.length)];
            String culoareCasti = culoare[(int) (Math.random() * culoare.length)];
            String stareCasti = stare[(int) (Math.random() * stare.length)];
            int garantieCasti = garantie[(int) (Math.random() * garantie.length)];
            float pretCasti = pret[(int) (Math.random() * pret.length)];
            int stocCasti = stoc[(int) (Math.random() * stoc.length)];
            String tipCasti = tip[(int) (Math.random() * tip.length)];
            String functiiCasti = functii[(int) (Math.random() * functii.length)];
            boolean microfonCasti = microfon[(int) (Math.random() * microfon.length)];
            int putereCasti = putere[(int) (Math.random() * putere.length)];
            Casti casti = new Casti(brandCasti, culoareCasti, stareCasti, garantieCasti, pretCasti, stocCasti, tipCasti,
                    functiiCasti, microfonCasti, putereCasti);
            listaCasti[i] = casti;

        }
        return listaCasti;
    }

}