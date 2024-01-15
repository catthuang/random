package com.company;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;

public class test extends JFrame{
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    ImageIcon a = new ImageIcon(new ImageIcon("https://i.ibb.co/hFbVMJg/reddit.png").getImage());
    URL url = new URL("https://i.ibb.co/hFbVMJg/reddit.png");  //https://i.ibb.co/hFbVMJg/reddit.png
    Image image = ImageIO.read(url);
    Icon icon = new ImageIcon(image);
    JButton button = new JButton();
    public test() throws IOException{
        frame.setLayout(null);
        //frame.setIconImage(image);
        button.setIcon(icon);
        button.setBounds(30,30,100,30);
        frame.add(button);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,100,1300,800);
    }

    public static void main(String[] args) throws IOException {
        test object = new test();
    }
}
