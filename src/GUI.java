package src;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import static src.resource.Disk;

public class GUI extends JFrame{



    public static void box() {
        JPanel redpanel = new JPanel();
        JPanel Disk = new JPanel();
        JPanel memp = new JPanel();
        JPanel thrds = new JPanel();

        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 1000, 100);
        Disk.setBounds(300, 150, 350, 100);
        memp.setBounds(300, 300, 350, 200);
        thrds.setBounds(300, 600, 350, 50);


        ArrayList<String> thread2String= resource.Thread2String();
        ArrayList<String> diskstring2 = resource.Disk2String();
        ArrayList<String> mem = resource.Memory2String();

        for (int i = 0; i < diskstring2.size(); i++) {
            Disk.add(new JLabel(diskstring2.get(i)));
        }
        for (int i = 0; i < mem.size(); i++) {
            memp.add(new JLabel(mem.get(i)));
        }
        for (int i = 0; i < thread2String.size(); i++) {
            thrds.add(new JLabel(thread2String.get(i)));
        }


        JFrame frame = new JFrame("Resource Monitor");
        JLabel l1 = new JLabel();

        redpanel.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        Disk.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Disk Usage"));
        memp.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Memory Usage"));
        thrds.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Thread Usage"));

        l1.setText("Welcome to Resource Monitor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.NORTH);
        l1.setFont(new Font("Arial", Font.BOLD, 40));

        frame.add(thrds);
        frame.add(memp);
        frame.revalidate();
        frame.repaint();
        frame.add(Disk);
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
