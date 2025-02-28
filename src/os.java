package src;


import java.util.Set;
import java.util.TreeSet;

public class os {


   private static String osinfo() {
         String os = System.getProperty("os.name");
         return os;

   }

   private static String info() {
        String os1 = System.getProperty("os.version");
        return os1;
   }



}
