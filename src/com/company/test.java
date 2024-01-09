package com.company;
import java.awt.*;
import javax.swing.*;

public class test{
    Graphics g;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton facesButton = new JButton("Face");
    JButton clothingButton = new JButton("Clothing");
    GridLayout layout = new GridLayout();
    JPanel avatar = new JPanel();
    JButton button = new JButton("d");

    public test(){
        frame.setBounds(300,100,1300,800);

        panel.setBounds(0,0,240,800);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        facesButton.setBounds(18,120,200,50);
        facesButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        facesButton.setFocusable(false);
        panel.add(facesButton);

        clothingButton.setBounds(18,190,200,50);
        clothingButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        clothingButton.setFocusable(false);
        panel.add(clothingButton);

        panel.setLayout(null);
        frame.add(panel);

        // avatar panel
        avatar.setBounds(320,0,400,800);
        avatar.setBorder(BorderFactory.createLineBorder(Color.black));

        g = avatar.getGraphics();
        avatar.paintComponents(g);

        frame.add(avatar);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        test object = new test();
    }
}
