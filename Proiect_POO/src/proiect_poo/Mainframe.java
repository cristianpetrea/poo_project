package proiect_poo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;




import javax.swing.*;

public class Mainframe extends JFrame {
    final private Font mainFont = new Font("segoe print", Font.BOLD, 18);

;

    public void initialize(){



        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);

                // Creeaza o caseta de text
                JTextArea textField = new JTextArea();

                // Seteaza latimea casetei
                textField.setRows(50);

//            Butoane
        JButton btnMiniCamere = new JButton("MINICAMERE");
        
        btnMiniCamere.setFont(mainFont);
    
        btnMiniCamere.addActionListener(new ActionListener(){
  
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub


                ArrayList<MiniCamere> result = GeneratorMiniCamere.genereazaRandomCamere(1);
                textField.setText(" " +result);
                

            }
  
        });
        btnMiniCamere.setBounds(400,400,50,50);

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
            }

        

        });
        


        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2 , 5, 5));
        buttonsPanel.add(btnMiniCamere);
        buttonsPanel.add(btnClear);

       



        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        mainPanel.add(textField);

        add(mainPanel);

        setTitle("bun venit");
        setSize(900,900);
        setMinimumSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args){
        Mainframe myFrame = new Mainframe();
        myFrame.initialize();
    }
}
