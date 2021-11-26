/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PSP_T1_Multihilo_Reloj;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class Vista extends JFrame{
    JLabel jlHora, jlMinuto, jlSegundo, jlSeparador, jlSeparador2;
    GridLayout gLayout;
    
    public Vista(){
        jlHora = new JLabel("00");
        jlMinuto = new JLabel("00");
        jlSegundo = new JLabel("00");
        jlSeparador = new JLabel(":");
        jlSeparador2 = new JLabel(":");
        
        gLayout = new GridLayout(1, 4);
        
        getContentPane().setLayout(gLayout);
        
        getContentPane().add(jlHora);
        getContentPane().add(jlSeparador);
        getContentPane().add(jlMinuto);
        getContentPane().add(jlSeparador2);
        getContentPane().add(jlSegundo);
        
        mostrar();
    }
    
    private void mostrar(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }
    
    public void cambiarHora(int hora){
        String horaTexto;
        if(hora < 10){
            horaTexto = "0" + hora;
        }else{
            horaTexto = hora + "";
        }
        jlHora.setText(horaTexto);
    }
    
    public void cambiarMinuto(int Minuto){
        String minutoTexto;
        if(Minuto < 10){
            minutoTexto = "0" + Minuto;
        }else{
            minutoTexto = Minuto + "";
        }
        jlMinuto.setText(minutoTexto);
    }
    
    public void cambiarSegundo(int Segundo){
        String segundoTexto;
        if(Segundo < 10){
            segundoTexto = "0" + Segundo;
        }else{
            segundoTexto = Segundo + "";
        }
        jlSegundo.setText(segundoTexto);
    }
}
