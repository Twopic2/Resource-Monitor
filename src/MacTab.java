package src;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MacTab {

    JFrame frame = new JFrame();

    JLabel l2 = new JLabel();

    JPanel redpanel = new JPanel();

    MacTab() throws IOException {

         //What generation Mac CPU it is
        JPanel ISA = new JPanel();
        ISA.setBounds(100, 135, 275, 50);
        ISA.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "ISA"));
        ArrayList<String> isa2string = apple.isa2string();
         for (int i = 0; i < isa2string.size(); i++) {
            ISA.add(new JLabel(isa2string.get(i)));

        }
         ISA.setFont(new Font("Arial", Font.BOLD, 10));
         frame.add(ISA);

         // Operating System info

        ArrayList<String> os2string = new ArrayList<>();


        JPanel OSP = new JPanel();
        OSP.setBounds(550, 135, 250, 50);
        String op = apple.osinfo();
        String info2 = apple.info();
        os2string.add(info2);



        OSP.add(new JLabel(op));
        for (String s : os2string) {
            OSP.add(new JLabel(s));
        }
        OSP.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Operating System"));
        frame.add(OSP);


         // Amount of CPUS
        JPanel Core = new JPanel();
        Core.setBounds(500, 500, 300, 300);
        Core.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Cores"));
        ArrayList<String> numOfCores = apple.numOfCores();

        for (int i = 0; i < numOfCores.size(); i++) {
            Core.add(new JLabel(numOfCores.get(i)));
        }
         Core.setFont(new Font("Arial", Font.BOLD, 5));
         frame.add(Core);

        //Cache
        JPanel Cache = new JPanel();
        HashMap<String, String> numOfCache = cache.cacheL1();
        Cache.setBounds(150, 300, 300, 300);
        Core.setFont(new Font("Arial", Font.BOLD, 5));
        l2.setText("L1 Cache");
        l2.setFont(new Font("Arial", Font.BOLD, 5));
        Cache.setBorder(new TitledBorder(new LineBorder(Color.black, 5), "Cache"));

        for (Map.Entry<String, String> entry : numOfCache.entrySet()) {
             Cache.add(new JLabel(entry.getKey() + ": " + entry.getValue()));
        }




        Cache.add(l2);
        frame.add(Cache);



        //Header
        redpanel.setBounds(0, 0, 1000, 100);
        redpanel.setBackground(Color.red);
        redpanel.setBorder(BorderFactory.createLineBorder(Color.black, 5));

        //Text for Header
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setVerticalAlignment(JLabel.NORTH);
        l2.setFont(new Font("Arial", Font.BOLD, 40));
        l2.setText("Macos Resource Monitor");
        redpanel.add(l2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(redpanel);



    }


}
