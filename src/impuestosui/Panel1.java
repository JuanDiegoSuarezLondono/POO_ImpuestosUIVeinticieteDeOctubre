/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestosui;

import Classes.*;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.swing.*;

/**
 *
 * @author suare
 */
public class Panel1 extends JPanel implements ActionListener{
    
    private Impuestos I;   
    private String s;
    private String[] s2;
    private BufferedReader procesador;
    private JLabel jLabelMarca;
    private JLabel jLabelLinea;
    private JLabel jLabelModelo;
    private JLabel jLabelValor;
    private JComboBox jComboBoxMarca;
    private JTextField jTextFieldLinea;
    private JTextField jTextFieldModelo;
    private JTextField jTextFieldValor;
    
    public Panel1() throws IOException {
        int i=0;        
        I=Impuestos.getInstance();
        procesador=new BufferedReader(new FileReader("IODemo.txt"));
        while(procesador.readLine()!=null)  {
            i++;
        }
        procesador.close();   
        s2=new String[i];
        i=0;
        procesador=new BufferedReader(new FileReader("IODemo.txt"));
        while((s=procesador.readLine())!=null)  {
            s2[i]=s;
            i++;
        }
        procesador.close(); 
        
        
        setLayout(new GridLayout(4,2));       
        jLabelMarca=new JLabel((ResourceBundle.getBundle("Interfaz\\conf", Locale.ENGLISH).getString("texto_Marca")));
        jLabelMarca.setSize(50,50);
        jLabelMarca.setVisible(true);  
        
        add(jLabelMarca);
        
        jComboBoxMarca=new JComboBox();
        jComboBoxMarca.setModel(new DefaultComboBoxModel(s2));
        jComboBoxMarca.setVisible(true);
        jComboBoxMarca.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jKeyReleased(evt);
            }
        });       
        add(jComboBoxMarca);
        
        jLabelLinea=new JLabel((ResourceBundle.getBundle("Interfaz\\conf", Locale.ENGLISH).getString("texto_Linea")));
        jLabelLinea.setSize(50,50);
        jLabelLinea.setVisible(true);
        add(jLabelLinea);
        
        jTextFieldLinea=new JTextField();
        jTextFieldLinea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jKeyReleased(evt);
            }
        });
        jTextFieldLinea.setVisible(true);
        add(jTextFieldLinea);
                
        jLabelModelo=new JLabel((ResourceBundle.getBundle("Interfaz\\conf", Locale.ENGLISH).getString("texto_Modelo")));
        jLabelModelo.setVisible(true);
        add(jLabelModelo);
        
        jTextFieldModelo=new JTextField();
        jTextFieldModelo.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jKeyReleased(evt);
            }
        });
        jTextFieldModelo.setVisible(true);
        add(jTextFieldModelo);
        
        jLabelValor=new JLabel((ResourceBundle.getBundle("Interfaz\\conf", Locale.ENGLISH).getString("texto_Valor")));
        jLabelValor.setVisible(true);
        add(jLabelValor);
        
        jTextFieldValor=new JTextField();
        jTextFieldValor.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                jKeyReleased(evt);
            }
        });
        jTextFieldValor.setVisible(true);
        add(jTextFieldValor);
    }
    
    private void jKeyReleased(KeyEvent evt) {
        if(!(jTextFieldLinea.getText().isEmpty()||/*jComboBoxMarca.get.isEmpty()||*/jTextFieldModelo.getText().isEmpty()||jTextFieldValor.getText().isEmpty())) {
            I.setV(new Vehiculo(/*jTextFieldMarca.getText()*/"Marca", jTextFieldLinea.getText(), jTextFieldModelo.getText(), Integer.parseInt(jTextFieldValor.getText())));
        }         
     }    

    public void actionPerformed(ActionEvent e) {      
        if(I.getLimpiar()==true) {
            jTextFieldLinea.setText("");
            jTextFieldModelo.setText("");
            jTextFieldValor.setText("");
        }
    }
}
