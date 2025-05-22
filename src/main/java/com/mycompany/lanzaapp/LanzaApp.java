/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lanzaapp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class LanzaApp {

    public static void main(String[] args) {

        //se crea una vista
        JFrame frame = new JFrame("Abrir Calculadora");
        //con esta instacia creamos un boton con un tamaño definido
        JButton button = new JButton("Calculadora");
        button.setPreferredSize(new Dimension(110, 50));
     
        //se agrega un escuchador de eventos lo que hara que se levante el aplicativo al dar click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder("calc.exe");
                    processBuilder.start();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
                }
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
