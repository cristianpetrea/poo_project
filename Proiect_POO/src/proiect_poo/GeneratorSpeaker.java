package proiect_poo;


import java.util.Random;

public class GeneratorSpeaker {
    static private String[] brand = { "Samsung", "Apple", "Sony", "A+", "Akai", "LG", "Lenovo", "Genesis" };//branduri de boxe

    static private String[] culoare = { "Negru", "Alb", "Rosu", "Verde", "Albastru", "Galben", "Portocaliu", "Gri" };//culori

    static private String[] stare = { "Nou", "Vechi" };

    static private int[] garantie = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private float[] pret = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

    static private int[] stoc = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    static private boolean[] onTheEar = { true, false };

    static private String[] operationalSystem = { "Windows", "IOS", "Android" };

    static private boolean[] microfon = { true, false };

    static private int[] frequency = { 2600, 2666, 3200, 3666 };

    static private int[] chargingTime = { 30, 60, 90, 120 };

    public static Speaker[] genereazaNisteSpeaker(int n) {
        Speaker[] listaSpeaker = new Speaker[n];
        for (int i = 0; i < n; i++) {
            String brandSpeaker = brand[new Random().nextInt(brand.length)];
            String culoareSpeaker = culoare[new Random().nextInt(culoare.length)];
            String stareSpeaker = stare[new Random().nextInt(stare.length)];
            int garantieSpeaker = garantie[new Random().nextInt(garantie.length)];
            float pretSpeaker = pret[new Random().nextInt(pret.length)];
            int stocSpeaker = stoc[new Random().nextInt(stoc.length)];
            boolean onTheEarSpeaker = onTheEar[new Random().nextInt(onTheEar.length)];
            boolean microfonSpeaker = microfon[new Random().nextInt(microfon.length)];
            String operationalSystemSpeaker = operationalSystem[new Random().nextInt(operationalSystem.length)];
            int frequencySpeaker = frequency[new Random().nextInt(frequency.length)];
            int chargingTimeSpeaker = chargingTime[new Random().nextInt(chargingTime.length)];

            Speaker speaker = new Speaker(brandSpeaker, culoareSpeaker, stareSpeaker, garantieSpeaker, pretSpeaker, stocSpeaker, onTheEarSpeaker,
            microfonSpeaker, operationalSystemSpeaker, chargingTimeSpeaker);
            listaSpeaker[i] = speaker;

        }
        return listaSpeaker;
    }

}
