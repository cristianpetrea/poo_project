package proiect_poo;

import java.util.ArrayList;

public class TestGenerator {
    public static void main(String[] args) {
				
		
		/// --- instantiere obiecte pe rand si adaugare in lista
		ArrayList<MiniCamere> chestii =new ArrayList<MiniCamere>();
		chestii.add(new MiniCamere("Sony", "galben", "uzat", 4, 100,0, 24, 50, 1080, 300, "Android"));
		chestii.add(new MiniCamere("Dell", "neon", "nou", 3, 120,33, 64, 30, 720, 500, "Android"));
		chestii.add(new MiniCamere("Samsung", "negru", "nou", 2, 80,64, 64, 20, 720, 600, "Android"));
		System.out.println(chestii);
		
		MiniCamere oCameraoarecare = chestii.get(0);
		System.out.println(" Camera din lista "+oCameraoarecare);		
		
		for(int i=0;i<chestii.size();i++)		
			System.out.println(chestii.get(i));
		
		
		System.out.println(" parcuregere cu for each");
		for(MiniCamere MiniCamere:chestii)
			System.out.println(MiniCamere);
		// Iterator - de testat cum se foloseste 	
		
		
		ArrayList<MiniCamere> listaGenericaDeObiecte = new ArrayList<MiniCamere>();
		listaGenericaDeObiecte.add(new MiniCamere("nokia","rosu","nou",2,3,4,2,3,1,0, "Android"));
		
		
		
		// este nevoie de cast la Copac ptr ca lista furnizeaza Object
		MiniCamere altaCamera = (MiniCamere) listaGenericaDeObiecte.get(0);
		System.out.println(altaCamera);
		
		
		///------------------------------------------------------------------------
			
		ArrayList<MiniCamere> listaCamere = GeneratorMiniCamere.genereazaRandomCamere(10);		
		System.out.println("lista de camere:");
		System.out.println(listaCamere);
		
		System.out.println("folosim for each pe lista");
		for(MiniCamere oCamera:listaCamere)
			System.out.println(oCamera);
		
		System.out.println("folosim for old style pe lista");
		for(int i=0;i<listaCamere.size();i++)
			System.out.println(listaCamere.get(i));
		
		
		MiniCamere[] vectorDeCamere = GeneratorMiniCamere.genereazaNisteCamere(10);
		System.out.println("vector de camere :");
		System.out.println(vectorDeCamere);
		
		System.out.println("folosim for each pe vector");
		for(MiniCamere oCamera:vectorDeCamere)
			System.out.println(oCamera);
		
		System.out.println("folosim for old style pe vector");
		for(int i=0;i<vectorDeCamere.length;i++)
			System.out.println(vectorDeCamere[i]);
	}

}
