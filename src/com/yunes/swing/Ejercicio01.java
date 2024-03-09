package com.yunes.swing;

import javax.swing.*;

public class Ejercicio01 {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("Mi primera ventana con swing");
        jFrame.setSize(800, 600);
        jFrame.setVisible(true);

        // clase para crear etiquetas
        JLabel jLabelSaludo = new JLabel();
        // cambiar apariencia de las apps.
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        jLabelSaludo.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        jLabelSaludo.setBounds(100,100, 580, 150);
        jFrame.add(jLabelSaludo);
        jFrame.setVisible(true);

        JButton jButtonAceptar = new JButton();
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(
                actionEvent-> {
                    //  System.out.println("haz dado click");
                    imprimirMensaje();
                }
        );
        jFrame.add(jButtonAceptar);
        jButtonAceptar.setBounds(450, 350, 140, 50);
        jFrame.add(jButtonAceptar);
        jFrame.setVisible(true);


    }

    public static void imprimirMensaje() {
        System.out.println("Este es un mensaje");
    }

}
