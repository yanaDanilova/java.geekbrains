package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class Main8 {
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();

    }
    }

public class MyWindow extends JFrame {


    public MyWindow() {
        setTitle("Funny Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 500);
        JLabel jLabel = new JLabel(" empty ");
        add(jLabel, BorderLayout.NORTH);
        JTextField jTextField = new JTextField();
        add(jTextField);
        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(jTextField.getText());
                jTextField.setText(null);


            }
        });

        JPanel jPanel = new JPanel();
        add(jPanel, BorderLayout.EAST);

        JButton jButton = new JButton("Submit");
        add(jButton, BorderLayout.SOUTH);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton jButton2 = new JButton();
                jPanel.add(jButton2);
                jButton2.setText(jTextField.getText());
                jTextField.setText(null);
            }
        });

        setVisible(true);

    }
  
}

