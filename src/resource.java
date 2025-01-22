package src;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

public class resource {

    public static File file = new File("/");
    public static MemoryMXBean memory = ManagementFactory.getMemoryMXBean();
    public static ThreadMXBean thread = ManagementFactory.getThreadMXBean();

    public static void Disk() {
        System.out.println(String.format("Total Space: %.2f GB", (double)file.getTotalSpace() / 1073741824));
        System.out.println(String.format("Free Space: %.2f GB", (double)file.getFreeSpace() / 1073741824));
        System.out.println(String.format("Usable Space: %.2f GB", (double)file.getUsableSpace() / 1073741824));
        System.out.println("-------------------------------------------------------------------------------");
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

    public static void Thread() {
       int Threadcount = thread.getThreadCount();


       System.out.println(String.format("Thread Count: %d",Threadcount + 1));

       //Daemon Threads are background threads hidden within the JVM.
       System.out.println(String.format("Daemon Thread Count: %d",thread.getDaemonThreadCount()));

    }
}
