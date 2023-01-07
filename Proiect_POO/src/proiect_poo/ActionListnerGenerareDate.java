package proiect_poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;



public class ActionListnerGenerareDate implements ActionListener{

	private JTextField jtext;
	
	public ActionListnerGenerareDate(JTextField jtext) {
		this.jtext=jtext;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		TestInterfata.listaCamere = GeneratorMiniCamere.genereazaRandomCamere(Integer.parseInt(jtext.getText()));	
		System.out.println(TestInterfata.listaCamere);
	}

}