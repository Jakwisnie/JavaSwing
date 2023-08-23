package org.exercise;

import org.apache.commons.lang3.time.StopWatch;

import java.awt.event.*;
import java.util.Date;

import java.util.TimerTask;
import java.util.Timer;
import java.util.UUID;
import javax.swing.*;
public class Stoper {
    public static void main(String[] args) {
        JFrame f=new JFrame("Stoper");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 200,50);
        JButton b=new JButton("Start");
        b.setBounds(50,100,50,50);
        TimerTask task = new TimerTask()
        {
            @Override
            public void run() {
                tf.setText(new Date()+"");
            }
        };

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                Timer timer = new Timer("Timer");
                timer.scheduleAtFixedRate(task, 1000L, 1000L);
                tf.setText(new Date()+"");


            }
        });
        JButton c=new JButton("Stop");
        c.setBounds(100,100,50,50);

        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                tf.setText(new Date()+"");
                task.cancel();
            }
        });
        f.add(b);f.add(tf);f.add(c);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}