
package proiect_poo;


public class MiniCamere extends Gadget {
    
   private int memorie;
   private  int greutate;
   private int format_foto;
   private int autonomie;
   private String SistemOperare;
    public MiniCamere(){
        super();
        memorie=0;
        greutate=0;
        format_foto=0;
        autonomie=0;
        SistemOperare=null;
        
    }
    public MiniCamere(String brand,String culoare,String stare,String garantie, float pret,int stoc,int memorie, int greutate,int format_foto,int autonomie,String SistemOperare){
        super(brand,culoare,stare,garantie,pret,stoc);
        this.memorie=memorie;
        this.greutate=greutate;
        this.format_foto=format_foto;
        this.autonomie=autonomie;
        this.SistemOperare=SistemOperare;
        
    }

    
 
    public int getMemorie() {
        return memorie;
    }
    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }
    public int getGreutate() {
        return greutate;
    }
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    public int getFormatFoto() {
        return format_foto;
    }
    public void setFormatFoto(int format_foto) {
        this.format_foto = format_foto;
    }
    public int getAutonomie() {
        return autonomie;
    }
    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }
    public String getSistemeOperare() {
        return SistemOperare;
    }
    public void setSistemeOperare(String SistemOperare) {
        this.SistemOperare = SistemOperare;
    }
    public MiniCamere(MiniCamere altaMiniCamera) {
        super();
        this.memorie=altaMiniCamera.memorie;
        this.greutate=altaMiniCamera.greutate;
        this.format_foto=altaMiniCamera.format_foto;
        this.autonomie=altaMiniCamera.autonomie;
        this.SistemOperare=altaMiniCamera.SistemOperare;
        
    }
   
    public String toString() {
        return super.toString()+".Memoria de "+memorie+" gb,  cu greutatea de "+greutate+" g. Are formatul foto de "+format_foto+"p si o autonomie de "+autonomie+" minute. Sistem de operare folosit este "+SistemOperare+" . ";
    }
}