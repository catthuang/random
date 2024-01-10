package com.company;
import java.awt.*;
import javax.swing.*;

public class test extends JFrame{
    testEvent test = new testEvent();
    Graphics g;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton faceButton = new JButton("Face");
    JPanel facePanel = new JPanel();
    JPanel facePanel2 = new JPanel();
    JButton[ ][ ] faces = new JButton[4][4];
    JLabel faceLabel = new JLabel("Face");
    ImageIcon face1 = new ImageIcon("face1.png");
    ImageIcon face2 = new ImageIcon("face2.png");
    ImageIcon face3 = new ImageIcon("face3.png");
    ImageIcon face4 = new ImageIcon("face4.png");
    ImageIcon face5 = new ImageIcon("face5.png");
    ImageIcon face6 = new ImageIcon("face6.png");
    ImageIcon face7 = new ImageIcon("face7.png");
    ImageIcon face8 = new ImageIcon("face8.png");
    ImageIcon face9 = new ImageIcon("face9.png");
    ImageIcon face10 = new ImageIcon("face10.png");
    ImageIcon face11 = new ImageIcon("face11.png");
    ImageIcon face12 = new ImageIcon("face12.png");
    ImageIcon face13 = new ImageIcon("face13.png");
    ImageIcon face14 = new ImageIcon("face14.png");
    ImageIcon face15 = new ImageIcon("face15.png");
    ImageIcon face16 = new ImageIcon("face16.png");
    JButton clothingButton = new JButton("Clothing");
    GridLayout gridLayout = new GridLayout(4,4,10,10);
    JPanel avatar = new JPanel();
    JButton button = new JButton("d");

//     play.addActionListener(tictac);
//        for (int x=0; x<=2; x++){
//        for (int y=0; y<=2; y++){
//            boxes[x][y].addActionListener(tictac);
//        }
//    }

    public test(){
        frame.setBounds(300,100,1300,800);

        panel.setBounds(0,0,240,800);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        faceButton.setBounds(18,120,200,50);
        faceButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        faceButton.setFocusable(false);
        panel.add(faceButton);

        clothingButton.setBounds(18,190,200,50);
        clothingButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        clothingButton.setFocusable(false);
        panel.add(clothingButton);

        panel.setLayout(null);
        frame.add(panel);

        // avatar panel
        avatar.setBounds(320,0,400,800);
        avatar.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(avatar);

        // faces panel
        facePanel.setBounds(740,0,560,800);
        facePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(facePanel);
        facePanel.setLayout(null);

        faceLabel.setBounds(780,50,60,10); //???
        faceLabel.setFont(new Font("SansSerif", Font.BOLD, 50));
        facePanel.add(faceLabel);

        int num = 37; // used in the next line--played around with the scaling of the images in the grid to fit my panel
        facePanel2.setBounds(740,180,15*num,15*num);
        facePanel2.setBorder(BorderFactory.createLineBorder(Color.red));
        facePanel2.setBorder(BorderFactory.createEmptyBorder(0,10,20,20));
        facePanel2.setLayout(gridLayout);
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                //String name = "face" + Integer.toString(i*3 + j + 1);  // goes from 1-12
                faces[i][j] = new JButton();
                facePanel2.add(faces[i][j]);
                if (i*3 + j == 0) {  // ???????
                    System.out.println('a');
                    faces[i][j].setIcon(face1);
                }
                else if (i*4 + j == 1) faces[i][j].setIcon(face2);
                else if (i*4 + j == 2) faces[i][j].setIcon(face3);
                else if (i*4 + j == 3) faces[i][j].setIcon(face4);
                else if (i*4 + j == 4) faces[i][j].setIcon(face5);
                else if (i*4 + j == 5) faces[i][j].setIcon(face6);
                else if (i*4 + j == 6) faces[i][j].setIcon(face7);
                else if (i*4 + j == 7) faces[i][j].setIcon(face8);
                else if (i*4 + j == 8) faces[i][j].setIcon(face9);
                else if (i*4 + j == 9) faces[i][j].setIcon(face10);
                else if (i*4 + j == 10) faces[i][j].setIcon(face11);
                else if (i*4 + j == 11) faces[i][j].setIcon(face12);
                else if (i*4 + j == 12) faces[i][j].setIcon(face13);
                else if (i*4 + j == 13) faces[i][j].setIcon(face14);
                else if (i*4 + j == 14) faces[i][j].setIcon(face15);
                else if (i*4 + j == 15) faces[i][j].setIcon(face16);
            }
        }
        frame.add(facePanel2);

        //
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {  //????????
        //g = avatar.getGraphics();
        //avatar.paintComponents(g);
        g.setColor(Color.green);
        g.drawOval(400,100,50,50);

    }



    public static void main(String[] args) {
        test object = new test();
        //object.paint(object.getGraphics());
    }
}
