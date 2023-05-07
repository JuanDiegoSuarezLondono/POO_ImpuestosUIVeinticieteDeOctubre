/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestosui;

import Classes.Impuestos;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author suare
 */
public class ImpuestosUI extends JFrame implements ActionListener{

    private Impuestos I;    
    private Panel1 panel1;
    private Panel2 panel2;
    private Panel3 panel3;
                
    public ImpuestosUI() throws IOException {
        I=Impuestos.getInstance();
        setLayout(new GridLayout(3,1));
        panel1=new Panel1();
        panel2=new Panel2();
        panel3=new Panel3(); 
        
        panel1.setVisible(true);
        add(panel1);
                
        panel2.setVisible(true);
        add(panel2);
        
        
        panel3.setVisible(true);
        add(panel3);  
        
        setBounds(0,0,342,423);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
        public void actionPerformed(ActionEvent e) {
            panel3.actionPerformed(e); 
    }        
            
    public static void main(String[] args) throws IOException {
        new ImpuestosUI().setVisible(true);       
    }
}
