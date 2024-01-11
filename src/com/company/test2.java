package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;


public class test2 extends JPanel{
    private Image image;

    public test2() {
        try {
            image = ImageIO.read(new File("path/to/your/image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw an image
        if (image != null) {
            g2d.drawImage(image, 300, 200, this);
        }
    }

}
