package src;

import javax.print.DocFlavor;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class resource {



    public static File file = new File("/"); // UNIX
    public static File file2 = new File("C:"); // Windows
    public static MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
    public static ThreadMXBean thread2 = ManagementFactory.getThreadMXBean();
    public static int Threadcount = thread2.getThreadCount();

    public static ArrayList<String> Disk2String() {

        ArrayList<String> Disk = new ArrayList<>();

        if (file.exists()) {
            Disk.add(String.format("Total UNIX Space: %.2f GB", (double) file.getTotalSpace() / 1073741824));
            Disk.add(String.format("Free UNIX Space: %.2f GB", (double) file.getFreeSpace() / 1073741824));
            Disk.add(String.format("Usable UNIX Space: %.2f GB", (double) file.getUsableSpace() / 1073741824));

        } if (file2.exists()) {
            Disk.add(String.format("Total Space: %.2f GB", (double) file2.getTotalSpace() / 1073741824));
            Disk.add(String.format("Free Space: %.2f GB", (double) file2.getFreeSpace() / 1073741824));
            Disk.add(String.format("Usable Space: %.2f GB", (double) file2.getUsableSpace() / 1073741824));

        }
        return Disk;
    }

    public static void Disk() {
        if (file.exists()) {
            System.out.println(String.format("Total UNIX Space: %.2f GB", (double) file.getTotalSpace() / 1073741824));
            System.out.println(String.format("Free UNIX Space: %.2f GB", (double) file.getFreeSpace() / 1073741824));
            System.out.println(String.format("Usable UNIX Space: %.2f GB", (double) file.getUsableSpace() / 1073741824));
            System.out.println("-------------------------------------------------------------------------------");
        }
        if (file2.exists()) {
            System.out.println(String.format("Total Space: %.2f GB", (double) file2.getTotalSpace() / 1073741824));
            System.out.println(String.format("Free Space: %.2f GB", (double) file2.getFreeSpace() / 1073741824));
            System.out.println(String.format("Usable Space: %.2f GB", (double) file2.getUsableSpace() / 1073741824));
            System.out.println("-------------------------------------------------------------------------------");
        }
    }


    /**
     Memory implamentation is currently wrong. Need to fix it.
     **/

    public static ArrayList<String> Memory2String() {
        ArrayList<String> mem = new ArrayList<>();

        mem.add(String.format("Heap Memory Initial: %.2f MB", (double)memory.getHeapMemoryUsage().getInit() / 1048576));
        mem.add(String.format("Heap Memory Used: %.2f GB", (double)memory.getHeapMemoryUsage().getUsed() / 1048576));
        mem.add(String.format("Heap Memory Available: %.2f MB", (double)memory.getHeapMemoryUsage().getInit() / 1048576));
        mem.add("---------------------------------------------------------------------------------------------------------");
        mem.add(String.format("Non Heap Memory Initial: %.2f GB", (double)memory.getNonHeapMemoryUsage().getInit() / 1048576));
        mem.add(String.format("Non Heap Memory Used: %.2f GB", (double)memory.getNonHeapMemoryUsage().getUsed() / 1048576));
        mem.add(String.format("Non Heap Memory Available: %.2f MB", (double)memory.getHeapMemoryUsage().getCommitted() / 1048576));

        return mem;
    }
    public static void Memory() {
        System.out.println(String.format("Heap Memory Initial: %.2f GB", (double)memory.getHeapMemoryUsage().getInit() / 1048576));
        System.out.println(String.format("Heap Memory Used: %.2f GB", (double)memory.getHeapMemoryUsage().getUsed() / 1048576));
        System.out.println(String.format("Heap Memory Available: %.2f GB", (double)memory.getHeapMemoryUsage().getInit() / 1048576));

        System.out.println("-------------------------------------------------------------------------------");

        //Memory which the JVM stores for futher uses
        System.out.println(String.format("Non Heap Memory Initial: %.2f GB", (double)memory.getNonHeapMemoryUsage().getInit() / 1048576));
        System.out.println(String.format("Non Heap Memory Used: %.2f GB", (double)memory.getNonHeapMemoryUsage().getUsed() / 1048576));
        System.out.println(String.format("Non Heap Memory Available: %.2f GB", (double)memory.getHeapMemoryUsage().getCommitted() / 1048576));

    }

    public static ArrayList<String> Thread2String() {
        ArrayList<String> thrd = new ArrayList<>();
        thrd.add((String.format("Thread Count: %d",Threadcount + 1)));
        thrd.add(String.format("Daemon Thread Count: %d",thread2.getDaemonThreadCount()));
        return thrd;
    }

    public static void Thread() {

       System.out.println(String.format("Thread Count: %d",Threadcount + 1));

       System.out.println(String.format("Daemon Thread Count: %d",thread2.getDaemonThreadCount()));

    }
}
