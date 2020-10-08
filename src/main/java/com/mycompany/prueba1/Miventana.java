/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba1;

/**
 *
 * @author Ghost
 */
import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;
public class Miventana extends JFrame{
    public Miventana(){
    super("mi otra ventana");
    setSize(500,600);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   Container cp= getContentPane();
   cp.setLayout(new FlowLayout());
   JLabel etiqueta = new JLabel("Nombre");
   JTextField texto= new JTextField(20) ;
   JButton boton = new JButton("ACEPTAR");
   cp.add(etiqueta);
   cp.add(texto);
   cp.add(boton);
            }
    
}
