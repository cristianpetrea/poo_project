package proiect_poo;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.io.*;





public class TestInterfata {
	
	public static ArrayList<MiniCamere> listaCamere;
	public static ArrayList<MiniCamere> listaMiniCamere;
	
	
	TestInterfata() {

        // Creeaza un textarea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
		
		textArea.setFont(new Font("Arial", Font.PLAIN, 24));
        // Seteaza pozitia si marimea textarea-ului
        textArea.setBounds(400, 60, 400, 320);


//culoare fundal
		JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.CYAN);

//Butoane	
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(500,500,80,80);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Adauga un listener pentru buton
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul in care se va salva textul
                File file = new File("text.txt");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                    // Scrie continutul campului de text in fisier
                    writer.write(textArea.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton clearButton = new JButton("Sterge");

        // Adauga un listener pentru buton
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creeaza un obiect File pentru fisierul care se va sterge
                File file = new File("text.txt");
                try (PrintWriter writer = new PrintWriter(file)) {
                    // Goleste continutul fisierului
                    writer.print("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });
        clearButton.setBounds(600,500,80,80);


		JButton genereazaBT = new JButton("Genereaza MiniCamere");
		genereazaBT.setBounds(20, 50, 200, 30);
		
        genereazaBT.addActionListener(new ActionListnerGenerareDate(null){
  
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            
               ArrayList<MiniCamere> result = GeneratorMiniCamere.genereazaRandomCamere(1);
                textArea.setText(" " +result);

                
            }
  
        });
		

        JButton btnClear = new JButton("Clear");
  
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                textArea.setText(" ");
            }

        

        });
		btnClear.setBounds(200,700,70,50);



		JButton genereazaBT2 = new JButton("Filtreaza dupa greutate ");
		genereazaBT2.setBounds(20, 130, 200, 30);
		
        genereazaBT2.addActionListener(new ActionLisnerFiltrareDate(null){
  
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            
               ArrayList<MiniCamere> result2 = SortareMiniCamere.filtreazaDupaGreutate(listaCamere,50);
                textArea.setText(" " +result2);
                

            }
  
        });
        


	
		
//implementari in interfata
        frame.add(clearButton);
		frame.add(genereazaBT);
        frame.add(textArea);
		frame.add(btnClear);
		frame.add(genereazaBT2);
		frame.add(saveButton);
		frame.setSize(900, 900);
		frame.setTitle("Interfata Grafica");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
        frame.add(scrollPane);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfata s = new TestInterfata();
       
	}
}