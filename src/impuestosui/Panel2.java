/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestosui;

import Classes.Impuestos;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author suare
 */
public class Panel2 extends JPanel implements ActionListener{
    
    private Impuestos I;
    private JCheckBox JCheckBoxProntoPago;
    private JCheckBox JCheckBoxServicioPublico;
    private JCheckBox JCheckBoxTrasladoDeCuenta;
    
    public Panel2() throws IOException {
        
        I=Impuestos.getInstance();
        setLayout(new GridLayout(2,2));
        
        JCheckBoxProntoPago=new JCheckBox("Pronto pago");
        JCheckBoxProntoPago.setActionCommand("P");
        JCheckBoxProntoPago.addActionListener(this);
        JCheckBoxProntoPago.setVisible(true);
        add(JCheckBoxProntoPago);
        
        JCheckBoxServicioPublico=new JCheckBox("Servicio publico");
        JCheckBoxServicioPublico.setActionCommand("S");
        JCheckBoxServicioPublico.addActionListener(this);
        JCheckBoxServicioPublico.setVisible(true);
        add(JCheckBoxServicioPublico);
        
        JCheckBoxTrasladoDeCuenta=new JCheckBox("Traslado de cuenta");
        JCheckBoxTrasladoDeCuenta.setActionCommand("T");
        JCheckBoxTrasladoDeCuenta.addActionListener(this);
        JCheckBoxTrasladoDeCuenta.setVisible(true);
        add(JCheckBoxTrasladoDeCuenta);
    }

    public void actionPerformed(ActionEvent e) {        
        String comand=e.getActionCommand();
        System.out.println(comand);
        switch(comand) {
            case"P":
                I.setTotalDPP();
            break;
            
            case"S":
                I.setTotalDSP();
            break;
            
            case"T":
                I.setTotalDTC();
            break;
        }        
    }
    
}
