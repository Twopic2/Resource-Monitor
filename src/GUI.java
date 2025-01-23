package src;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class GUI extends JFrame{


    public static void box() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0, 0, 30, 30);
        JFrame frame = new JFrame("Resource Monitor");
        JLabel l1 = new JLabel("Welcome to Resource Monitor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.NORTH);
        l1.setFont(new Font("Arial", Font.BOLD, 40));

        frame.add(l1);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.add(panel);

    }


    public static void main(String[] args) {
        box();


    }
}
