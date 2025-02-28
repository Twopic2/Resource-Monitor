package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class apple  {

    public static String osinfo() {
         String os = System.getProperty("os.name");
         return os;

   }

   public static String info() {
        String os1 = System.getProperty("os.version");
        return os1;
   }

    public static ArrayList<String> isa2string() {
        ArrayList<String> isa = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec("sysctl -a | grep machdep.cpu.brand_string");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            isa.add(String.format(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isa;

    }

    public static ArrayList<String> numOfCores() {
        ArrayList<String> instructions = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec("sysctl -a | grep machdep.cpu.core_count");
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            instructions.add(String.format(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return instructions;

    }

   }





