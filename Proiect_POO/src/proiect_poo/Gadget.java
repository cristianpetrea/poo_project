
package proiect_poo;

public class Gadget implements Electronice {

    public void AfisarePret() {
        System.out.println("Pretul este: ");
    }

    public void AfisareStoc() {
        System.out.println("Stocul este");
    }

    String brand, culoare, stare, garantie;
    float pret;
    int stoc;

    public Gadget() {
        brand = null;
        culoare = null;
        stare = null;
        garantie = null;
        pret = 0.0f;
        stoc = 0;

    }

    public Gadget(String brand, String culoare, String stare, String garantie, float pret, int stoc) {
        this.brand = brand;
        this.culoare = culoare;
        this.stare = stare;
        this.garantie = garantie;
        this.pret = pret;
        this.stoc = stoc;
    }

    public Gadget(Gadget g) {
        this.brand = g.brand;
        this.culoare = g.culoare;
        this.stare = g.stare;
        this.garantie = g.garantie;
        this.pret = g.pret;
        this.stoc = g.stoc;
    }

    @Override
    public String toString() {
        return "Brandul este " + brand + ", are culoarea " + culoare + ", starea produsului este " + stare
                + ", are pretul de " + pret + " cu o garantie de " + garantie + " ani";
    }

}
