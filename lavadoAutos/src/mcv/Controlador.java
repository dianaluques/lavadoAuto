/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestor Luque
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Vista vista;
    private int cantidad = 0;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.b1.addActionListener(this);
    }
    public void iniciarVista() {
        vista.setVisible(true);
    }
    public void actionPerformed(ActionEvent evento) {
        if(vista.b1 == evento.getSource()) {
            
            if( vista.rb1.isSelected()){
                
                if( vista.rb3.isSelected()){
                    modelo.getLavBasAu();
                    cantidad = modelo.getLavBasAu();
                }
                if( vista.rb4.isSelected()){
                    modelo.getLavEspAu();
                    cantidad = modelo.getLavEspAu();
                }
                if( vista.rb5.isSelected()){
                    modelo.getDesBasAu();
                    cantidad = modelo.getDesBasAu();
                }
                if( vista.rb6.isSelected()){
                    modelo.getDesAvanAu();
                    cantidad = modelo.getDesAvanAu();
                }
                if( vista.rb8.isSelected()){
                    modelo.getComb1Au();
                    cantidad = modelo.getComb1Au();
                }
                if( vista.rb9.isSelected()){
                    modelo.getComb2Au();
                    cantidad = modelo.getComb2Au();
                }
                if( vista.rb10.isSelected()){
                    modelo.getComb3Au();
                    cantidad = modelo.getComb3Au();
                }
            }
            if( vista.rb2.isSelected()){
                
                if( vista.rb3.isSelected()){
                    modelo.getLavBasCam();
                    cantidad = modelo.getLavBasCam();
                }
                if( vista.rb4.isSelected()){
                    modelo.getLavEspCam();
                    cantidad = modelo.getLavEspCam();
                }
                if( vista.rb5.isSelected()){
                    modelo.getDesBasCam();
                    cantidad = modelo.getDesBasCam();
                }
                if( vista.rb6.isSelected()){
                    modelo.getDesAvanCam();
                    cantidad = modelo.getDesAvanCam();
                }
                if( vista.rb8.isSelected()){
                    modelo.getComb1Cam();
                    cantidad = modelo.getComb1Cam();
                }
                if( vista.rb9.isSelected()){
                    modelo.getComb2Cam();
                    cantidad = modelo.getComb2Cam();
                }
                if( vista.rb10.isSelected()){
                    modelo.getComb3Cam();
                    cantidad = modelo.getComb3Cam();
                }
            }
            JOptionPane.showMessageDialog(null,"Total a pagar "+ cantidad);
        }
    }
}
