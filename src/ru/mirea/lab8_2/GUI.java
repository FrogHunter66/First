package ru.mirea.lab8_2;

import javax.swing.*;

public class GUI extends JFrame {
    GUI(String filename) {
        super("Image");
        setSize(640,640);
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        JLabel jl = new JLabel(icon);
        jl.setBounds(0,0,640,640);
        setLocationRelativeTo(null);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        String filename = "photo.jpg";
        for (int i = 0; i < args.length; i++) {
            filename = args[i];
        }
        new GUI(filename);
    }
}