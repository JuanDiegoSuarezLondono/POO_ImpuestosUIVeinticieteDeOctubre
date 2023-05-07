/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestosui;

import Classes.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author suare
 */
public class Panel3 extends JPanel implements ActionListener{
    
    private Impuestos I;
    private JLabel jLabelTotalAPagar;    
    private JTextField jTextFieldTotalAPagar;
    private JButton JButtonLimpiar;
    private JButton JButtonCalcular;
    private JLabel JLabel11;
    private JLabel JLabel12;
    
    public Panel3() throws IOException {
        
        I=Impuestos.getInstance();
        setLayout(new GridLayout(2,3));
        
        JLabel11=new JLabel();
        JLabel11.setVisible(true);
        add(JLabel11);
        
        JLabel12=new JLabel();
        JLabel12.setVisible(true);
        add(JLabel12);
        
        JButtonLimpiar=new JButton("Limpiar");        
        JButtonLimpiar.setVisible(true);
        JButtonLimpiar.setActionCommand("Limpiar");
        JButtonLimpiar.addActionListener(this);
        add(JButtonLimpiar);
        
        jLabelTotalAPagar=new JLabel("Total a Pagar");
        jLabelTotalAPagar.setVisible(true);
        add(jLabelTotalAPagar);
        
        jTextFieldTotalAPagar=new JTextField();
        jTextFieldTotalAPagar.enable(false);
        jTextFieldTotalAPagar.setVisible(true);
        add(jTextFieldTotalAPagar);
        
        JButtonCalcular=new JButton("Calcular");        
        JButtonCalcular.setVisible(true);
        JButtonCalcular.setActionCommand("Calcular");
        JButtonCalcular.addActionListener(this);
        add(JButtonCalcular);   
    }

    
    public void actionPerformed(ActionEvent e) {        
        String comando=e.getActionCommand();
        if(comando=="Limpiar") { 
            I.setLimpiar(true);
        }
        else if(comando=="Calcular") {
            jTextFieldTotalAPagar.setText(String.valueOf(I.getTotal()));
        }
    }
    
}
