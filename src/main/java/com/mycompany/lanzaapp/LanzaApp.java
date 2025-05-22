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
        JFrame frame = new JFrame("Shell Grafico personalizado");
        //con esta instacia creamos un boton con un tamaño definido
        JButton button1 = new JButton("Google");
        button1.setPreferredSize(new Dimension(110, 50));
     
        //se agrega un escuchador de eventos lo que hara que se levante el aplicativo al dar click
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                   ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start https://www.google.com");
                    processBuilder.start();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
                }
            }
        });
        JButton button2 = new JButton("bloc de notas");
        button2.setPreferredSize(new Dimension(110, 50));
     
        //se agrega un escuchador de eventos lo que hara que se levante el aplicativo al dar click
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder("notepad");
                    processBuilder.start();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
                }
            }
        });
        
        JButton button3 = new JButton("CMD");
        button3.setPreferredSize(new Dimension(110, 50));
     
        //se agrega un escuchador de eventos lo que hara que se levante el aplicativo al dar click
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start cmd");
                    processBuilder.start();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    ex.printStackTrace();
                }
            }
        });
        
        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
