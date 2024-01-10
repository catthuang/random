package com.company;
import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame {



    public static void main(String[] args) {
        int[][] thing = new int[4][3];
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                String name = "face " + Integer.toString(i*3 + j + 1);
                System.out.print(name);
            }
        }
    }


}
