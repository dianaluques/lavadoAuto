/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcv;



import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Vista extends JFrame {
    
    public JLabel l1, l2, l3, l4;
    public JRadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8, rb9, rb10;
    public JButton b1;
    public ButtonGroup grupoRadio, grupoRadio1, grupoRadio2;

    public Vista() {
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        grupoRadio = new ButtonGroup();
        grupoRadio1 = new ButtonGroup();
        grupoRadio2 = new ButtonGroup();
        
        b1 = new JButton("Calcular");
        b1.setBounds(210, 340, 160, 20);
        
        l1 = new JLabel ("Lavado de  autos La Estrella");
        l1.setBounds(150, 20, 200, 30);
        
        l2 = new JLabel ("Seleccione el tipo de vehiculo:");
        l2.setBounds(20, 50, 200, 20);
        
        rb1 = new JRadioButton("Automovil");
        rb1.setBounds(20, 70, 200, 20);
        
        rb2 = new JRadioButton("Camioneta");
        rb2.setBounds(20, 90, 200, 20);
        
        l3 = new JLabel ("Seleccione servicio:");
        l3.setBounds(20, 120, 200, 20);
        
        rb3 = new JRadioButton("Lavado basico: lavado exterior, lavado interior y aspirada");
        rb3.setBounds(20, 140, 320, 20);
        
        rb4 = new JRadioButton("Lavado Especial: lavado basico, polinchada con maquina con las mejores ceras");
        rb4.setBounds(20, 160, 400, 20);
         
        rb5 = new JRadioButton("Desinfeccion basica: Con maquina generadora de ozono");
        rb5.setBounds(20, 180, 310, 20);
        
        rb6 = new JRadioButton("Desinfeccion avanzada: Desinfeccion basica , limpieza interior con maquina a vapor");
        rb6.setBounds(20, 200, 450, 20);
        
        rb7 = new JRadioButton("Combos");
        rb7.setBounds(20, 220, 200, 20);
         
        l4 = new JLabel ("Seleccione el combo que quiere:");
        l4.setBounds(40, 250, 240, 20);
        
        rb8 = new JRadioButton("Combo 1. Lavado + polinchado + desengrasante por debajo");
        rb8.setBounds(40, 270, 330, 20);
        
        rb9 = new JRadioButton("Combo 2. Combo 1 + grafitado de chasis");
        rb9.setBounds(40, 290, 260, 20);
        
        rb10 = new JRadioButton("Combo 3. Combo 2 + tapiceria(desmontado de sillas para un aseo mas profundo)");
        rb10.setBounds(40, 310, 430, 20);
        
       grupoRadio.add(rb1);
       grupoRadio.add(rb2);
       
       grupoRadio1.add(rb3);
       grupoRadio1.add(rb4);
       grupoRadio1.add(rb5);
       grupoRadio1.add(rb6);
       grupoRadio1.add(rb7);
       
       grupoRadio2.add(rb8);
       grupoRadio2.add(rb9);
       grupoRadio2.add(rb10);
        
        add(l1);
        add(l2);
        add(rb1);
        add(rb2);
        add(l3);
        add(rb3);
        add(rb4);
        add(rb5);
        add(rb6);
        add(rb7);
        add(l4);
        add(rb8);
        add(rb9);
        add(rb10);
        add(b1);
    }

   
}
