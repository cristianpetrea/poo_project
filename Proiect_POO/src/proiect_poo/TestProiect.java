package proiect_poo;

public class TestProiect {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Gadget ProduseElectronica =new Gadget("Samsung","rosu","nou","4ani",2999,12);
        ProduseElectronica.AfisarePret();
        ProduseElectronica.AfisareStoc();
        System.out.println(ProduseElectronica.toString());
        Gadget produs1 = new Gadget();
        System.out.println(produs1.toString());
        MiniCamere model1,model2;
        model1=new MiniCamere();
        model2=new MiniCamere("Nokia","gri","utilizat","2ani ", 2699,9,64,25,1080,3000,"Android");
        System.out.println(model1.toString());
        System.out.println(model2.toString());
        System.out.println(model2.getMemorie());
        model1.setMemorie(12);
        System.out.println(model1.getMemorie());
        MiniCamere model3;
        model3=model2;
        System.out.println(model3.toString());
    }
}
