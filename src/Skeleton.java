package src;

import java.io.File;
import java.lang.management.*;


public class Skeleton {


    public static void main(String[] args) {


        while (true) {



            resource.Disk();
            resource.Memory();
            resource.Thread();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }




}
