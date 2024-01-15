package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class finalProject extends JFrame implements ActionListener{
    Graphics g;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton skinToneButton = new JButton("Skin Tone");
    JButton faceButton = new JButton("Face");
    JPanel facePanel = new JPanel();
    JPanel facePanel2 = new JPanel();
    JButton[ ] faces = new JButton[16];
    JLabel headingLabel = new JLabel("Face");
    JLabel head = new JLabel();
    int headX = 150, headY = 200, headWidth = 100;
    ImageIcon robloxHead = new ImageIcon(new ImageIcon("roblox head2.png").getImage().getScaledInstance(headWidth, headWidth, Image.SCALE_DEFAULT));
    JLabel avatarFace = new JLabel();
    ImageIcon face1 = new ImageIcon(new ImageIcon("face1.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face2 = new ImageIcon(new ImageIcon("face2.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face3 = new ImageIcon(new ImageIcon("face3.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face4 = new ImageIcon(new ImageIcon("face4.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face5 = new ImageIcon(new ImageIcon("face5.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face6 = new ImageIcon(new ImageIcon("face6.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face7 = new ImageIcon(new ImageIcon("face7.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face8 = new ImageIcon(new ImageIcon("face8.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face9 = new ImageIcon(new ImageIcon("face9.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face10 = new ImageIcon(new ImageIcon("face10.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face11 = new ImageIcon(new ImageIcon("face11.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face12 = new ImageIcon(new ImageIcon("face12.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face13 = new ImageIcon(new ImageIcon("face13.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face14 = new ImageIcon(new ImageIcon("face14.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face15 = new ImageIcon(new ImageIcon("face15.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    ImageIcon face16 = new ImageIcon(new ImageIcon("face16.png").getImage().getScaledInstance(125, 125, Image.SCALE_DEFAULT));
    JButton clothingButton = new JButton("Clothing");
    GridLayout gridLayout = new GridLayout(4,4,10,10);
    JPanel avatar = new JPanel();
    JButton button = new JButton("d");
    JLabel shirt = new JLabel();
    ImageIcon heartShirt = new ImageIcon(new ImageIcon("pixil-frame-0.png").getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT));

    public finalProject() throws IOException{

        // frame -----------------------------------------------
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,800);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.white);

        // side panel -----------------------------------------------
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

        // avatar panel -----------------------------------------------
        avatar.setLayout(null);
        avatar.setBounds(320,0,400,800);
        avatar.setBorder(BorderFactory.createLineBorder(Color.black));
        head.setBounds(headX, headY, headWidth, headWidth);
        head.setBorder(BorderFactory.createLineBorder(Color.black));
        //head.setHorizontalAlignment(SwingConstants.LEFT); // ***
        head.setIcon(robloxHead);
        ImageIcon faceResized = new ImageIcon(face1.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
        avatarFace.setIcon(faceResized);  // default face, resized
        avatarFace.setBounds(headX, headY, headWidth, headWidth);  // 150,200, 100,100
        avatarFace.setBorder(null);
        avatar.add(avatarFace);
        avatar.add(head);
        frame.add(avatar);
        avatar.setBackground(null);

        shirt.setIcon(heartShirt);
        shirt.setBounds(100,300,200,150);  // 200,150 scaling
        shirt.setBorder(BorderFactory.createLineBorder(Color.black));
        avatar.add(shirt);


        // right side panel -----------------------------------------------
        facePanel.setBounds(740,0,560,800);
        facePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(facePanel);
        facePanel.setLayout(null);

        headingLabel.setBounds(40,50,60,10); //???
        headingLabel.setFont(new Font("SansSerif", Font.BOLD, 50));
        facePanel.add(headingLabel);

        int num = 37; // scaling of images in grid
        facePanel2.setBounds(740,180,15*num,15*num);
        facePanel2.setBorder(BorderFactory.createLineBorder(Color.red));
        facePanel2.setBorder(BorderFactory.createEmptyBorder(0,10,20,20));
        facePanel2.setLayout(gridLayout);
        for (int i=0; i<16; i++) {
            faces[i] = new JButton();
            facePanel2.add(faces[i]);
            faces[i].addActionListener(this);
        }
        faces[0].setIcon(face1);
        faces[1].setIcon(face2);
        faces[2].setIcon(face3);
        faces[3].setIcon(face4);
        faces[4].setIcon(face5);
        faces[5].setIcon(face6);
        faces[6].setIcon(face7);
        faces[7].setIcon(face8);
        faces[8].setIcon(face9);
        faces[9].setIcon(face10);
        faces[10].setIcon(face11);
        faces[11].setIcon(face12);
        faces[12].setIcon(face13);
        faces[13].setIcon(face14);
        faces[14].setIcon(face15);
        faces[15].setIcon(face16);
        frame.add(facePanel2);
    }

//    @Override
//    public void paint(Graphics g) {
//        Graphics2D gui = (Graphics2D) g;
//        gui.drawLine(0,0,1000,100);
//    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == faces[0]){
            ImageIcon faceResized = new ImageIcon(face1.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[1]){
            ImageIcon faceResized = new ImageIcon(face2.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[2]){
            ImageIcon faceResized = new ImageIcon(face3.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[3]){
            ImageIcon faceResized = new ImageIcon(face4.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[4]){
            ImageIcon faceResized = new ImageIcon(face5.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[5]){
            ImageIcon faceResized = new ImageIcon(face6.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[6]){
            ImageIcon faceResized = new ImageIcon(face7.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[7]){
            ImageIcon faceResized = new ImageIcon(face8.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[8]){
            ImageIcon faceResized = new ImageIcon(face9.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[9]){
            ImageIcon faceResized = new ImageIcon(face10.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[10]){
            ImageIcon faceResized = new ImageIcon(face11.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[11]){
            ImageIcon faceResized = new ImageIcon(face12.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[12]){
            ImageIcon faceResized = new ImageIcon(face13.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[13]){
            ImageIcon faceResized = new ImageIcon(face14.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[14]){
            ImageIcon faceResized = new ImageIcon(face15.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        } else if (e.getSource() == faces[15]){
            ImageIcon faceResized = new ImageIcon(face16.getImage().getScaledInstance(headWidth,headWidth, Image.SCALE_DEFAULT));
            avatarFace.setIcon(faceResized);
        }


    }



    public static void main(String[] args) throws IOException {
        finalProject object = new finalProject();
        //object.paint(object.getGraphics());
    }
}
