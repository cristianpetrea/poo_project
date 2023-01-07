package proiect_poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;


public class ActionLisnerFiltrareDate implements ActionListener{

	private JTextField jtext;
	
	public ActionLisnerFiltrareDate(JTextField jtext) {
		this.jtext=jtext;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TestInterfata.listaMiniCamere = SortareMiniCamere.filtreazaDupaGreutate(TestInterfata.listaCamere,Integer.parseInt(jtext.getText()));	
		System.out.println(" Date filtrate ");
		System.out.println(TestInterfata.listaMiniCamere);
	}
}