package com.company;
import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
    //TicTacEvent tictac = new TicTacEvent(this);
    JPanel row1 = new JPanel();
    JButton[ ] [ ] boxes = new JButton [3][3];
    JButton play = new JButton ("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("white.jpg ");

    public TicTac() {
        super ("Tic Tac Toe");
        setSize (500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(4, 3, 10, 10);
        row1.setLayout(layout1);

        for (int x=0; x<3; x++){
            for (int y=0; y<3; y++){
                name++;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(play);
        row1.add(blank2);
        add(row1);

        setVisible(true);
    }

    public static void main(String[] args) {
        TicTac frame = new TicTac();
    }
}
