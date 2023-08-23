package org.exercise;

import java.awt.event.*;
import java.util.UUID;
import javax.swing.*;
public class PasswordGenerator {
    public static void main(String[] args) {
        JFrame f=new JFrame("Password Generator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Generate");
        b.setBounds(50,100,95,30);
        String uniqueID = UUID.randomUUID().toString();
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(uniqueID);
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}