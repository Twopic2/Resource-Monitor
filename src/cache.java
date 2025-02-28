package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class cache {

    // Macos
    public static HashMap<String, String> cacheL1() {
        HashMap<String, String> l1Cache = new HashMap<>();

        try {
            Process p = Runtime.getRuntime().exec(new String[]{"sh", "-c", "sysctl -a | grep hw.perflevel0.l1[cdi]cachesize:"});
            p.waitFor();
            //Process p1 = Runtime.getRuntime().exec("sysctl -a | grep hw.perflevel0.l1dcachesize:");
            //BufferedReader reader1 = new BufferedReader(new InputStreamReader(p1.getInputStream()));
            //l1Cache.put(String.format(reader.readLine()), String.format(reader1.readLine()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
                if (parts.length == 2) {
                    l1Cache.put(parts[0].trim(), parts[1].trim());
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return l1Cache;

    }

    public static ArrayList<String> cacheL2() {
        ArrayList<String> l2Cache = new ArrayList<>();
        try {
            Process p = Runtime.getRuntime().exec("sysctl -a | grep hw.perflevel0.l2cachesize");
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            l2Cache.add(String.format(reader.readLine()));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return l2Cache;

    }

}
