package src;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class GUI extends JFrame{


    public static void box() {
        JPanel redpanel = new JPanel();
        JPanel resource = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 1000, 100);
        resource.setBounds(0, 100, 1000, 900);

        JFrame frame = new JFrame("Resource Monitor");
        JLabel l1 = new JLabel();
        redpanel.setBorder(BorderFactory.createLineBorder(Color.black));


        l1.setText("Welcome to Resource Monitor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.NORTH);
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        frame.setResizable(false);
        frame.add(resource);
        frame.add(l1);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redpanel);
        redpanel.add(l1);


    }



    public static void main(String[] args) {
        box();


    }
}
