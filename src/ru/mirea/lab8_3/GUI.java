package ru.mirea.lab8_3;


import javax.swing.*;

public class GUI extends JFrame {
    GUI(String filename) {
        super("Image");
        setSize(498,429);
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        JLabel jl = new JLabel(icon);
        jl.setBounds(0,0,498,429);
        setLocationRelativeTo(null);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        String filename = "gifka.gif";
        new GUI(filename);
    }
}