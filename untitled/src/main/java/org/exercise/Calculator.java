package org.exercise;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import javax.swing.*;
public class Calculator {
    public static String str="";
    public static void main(String[] args) {
        JFrame f=new JFrame("Calculator");
        final JTextField tf=new JTextField();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("1");
        b.setBounds(50,100,50,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"1";
                str=result;
                tf.setText(str);
            }
        });
        JButton c=new JButton("2");
        c.setBounds(100,100,50,50);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str+"2";
                str=result;
                tf.setText(str);
            }
        });
        JButton d=new JButton("3");
        d.setBounds(150,100,50,50);
        d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"3";
                str=result;
                tf.setText(str);
            }
        });
        JButton e=new JButton("4");
        e.setBounds(50,150,50,50);
        e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"4";
                str=result;
                tf.setText(str);
            }
        });
        JButton q=new JButton("5");
        q.setBounds(100,150,50,50);
        q.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str+"5";
                str=result;
                tf.setText(str);
            }
        });JButton g=new JButton("6");
        g.setBounds(150,150,50,50);
        g.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"6";
                str=result;
                tf.setText(str);
            }
        });JButton h=new JButton("7");
        h.setBounds(50,200,50,50);
        h.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"7";
                str=result;
                tf.setText(str);
            }
        });JButton i=new JButton("8");
        i.setBounds(100,200,50,50);
        i.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"8";
                str=result;
                tf.setText(str);
            }
        });JButton j=new JButton("9");
        j.setBounds(150,200,50,50);
        j.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"9";
                str=result;
                tf.setText(str);
            }
        });
        JButton k=new JButton("0");
        k.setBounds(50,250,50,50);
        k.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str +"0";
                str=result;
                tf.setText(str);
            }
        });
        JButton l=new JButton("+");
        l.setBounds(100,250,50,50);
        l.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                if(!str.endsWith("*") && !str.endsWith("-") && !str.endsWith("+") && !str.endsWith("/")) {
                    result = str +"+";
                str=result;}
                tf.setText(str);
            }
        });
        JButton m=new JButton("-");
        m.setBounds(150,250,50,50);
        m.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                if(!str.endsWith("*") && !str.endsWith("-") && !str.endsWith("+") && !str.endsWith("/")) {
                    result = str + "-";
                    str = result;
                }
                tf.setText(str);
            }
        });

        JButton n=new JButton("/");
        n.setBounds(50,300,50,50);
        n.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                if(!str.endsWith("*") && !str.endsWith("-") && !str.endsWith("+") && !str.endsWith("/")) {
                    result = str +"/";
                str=result;}
                tf.setText(str);
            }
        });
        JButton o=new JButton("*");
        o.setBounds(100,300,50,50);
        o.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                if(!str.endsWith("*") && !str.endsWith("-") && !str.endsWith("+") && !str.endsWith("/")) {
                    result = str+"*";
                str=result;}
                tf.setText(str);
            }
        });
        JButton p=new JButton("=");
        p.setBounds(150,300,50,50);
        p.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Expression expression = new ExpressionBuilder(str).build();
                double result = expression.evaluate();
                int leftCount=0;
                int rightCount=0;
                for (int i = 0; i < str.length(); i++) {
                    String c = str.charAt(i) + "";
                    if (c.equals("(")) {
                        leftCount++;
                    }
                    if (c.equals(")")) {
                        rightCount++;
                    }
                }
                if(leftCount==rightCount){
                    str=result+"";
                }


                tf.setText(str);
            }
        });
        JButton a=new JButton("C");
        a.setBounds(50,350,50,50);
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                result = str.substring(0, str.length() - 1);
                str=result;
                tf.setText(str);
            }
        });
        JButton z=new JButton("(");
        z.setBounds(100,350,50,50);
        z.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                int leftCount=0;
                int rightCount=0;
                for (int i = 0; i < str.length(); i++) {
                    String c = str.charAt(i) + "";
                    if (c.equals("(")) {
                        leftCount++;
                    }
                    if (c.equals(")")) {
                        rightCount++;
                    }
                }
                if(leftCount==rightCount){
                    result = str +"(";
                    str=result;
                }
                tf.setText(str);
            }
        });
        JButton x=new JButton(")");
        x.setBounds(150,350,50,50);
        x.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String result="";
                int leftCount=0;
                int rightCount=0;
                for (int i = 0; i < str.length(); i++) {
                    String c = str.charAt(i) + "";
                    if (c.equals("(")) {
                        leftCount++;
                    }
                    if (c.equals(")")) {
                        rightCount++;
                    }
                }
                if(leftCount==rightCount+1){
                result = str +")";
                str=result;
                }



                tf.setText(str);
            }
        });
        f.add(b);f.add(tf);f.add(d);
        f.add(c);f.add(e);
        f.add(q);f.add(g);f.add(h);
        f.add(i);f.add(j);f.add(z);f.add(x);
        f.add(k);f.add(l);f.add(a);
        f.add(m);f.add(n);f.add(o);f.add(p);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}