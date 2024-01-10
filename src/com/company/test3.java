package com.company;
import javax.swing.*;
import java.awt.*;

public class test3 extends JFrame{
    //test3Event thing = new test3Event();
    JButton button = new JButton("Button");
    JButton button2 = new JButton("Button 2");
    JLabel label = new JLabel("DDDDDDDDDDDDDDDDD");

    public test3() {
        setSize(1000,800);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,5,10,5));
        panel.setLayout(null); //new GridLayout(1,2,20,10)

        panel.add(button);
        panel.add(label);

        label.setBounds(550,80,350,30);
        label.setOpaque(true);
        label.setBackground(Color.RED);

        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("title");

        setVisible(true);
    }
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawOval(400,100,50,50);

        //
    }

    public static void main(String[] args) {
        new test3();
    }
}
