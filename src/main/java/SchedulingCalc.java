import java.util.*;

public class SchedulingCalc {

    static List<Process> cloneList(List<Process> list) {
        List<Process> out = new ArrayList<>();
        for (Process p : list) out.add(p.copy());
        return out;
    }
    static void runFCFS(List<Process> procs) {
        // All arrive at time 0 in given order
        int currentTime = 0;
        double totalWait = 0;
        System.out.println("Process ID | Waiting Time | Turnaround Time");
        for (Process p : procs) {
            p.start = Math.max(currentTime, p.arrival);
            p.completion = p.start + p.burst;
            p.turnaround = p.completion - p.arrival;
            p.waiting = p.start - p.arrival;
            currentTime = p.completion;

            totalWait += p.waiting;
            System.out.format("    %d            |     %d         |      %d%n",
                    p.id, p.waiting, p.turnaround);
        }
        System.out.printf("Average waiting time = %.2f ms%n", totalWait / procs.size());
    }

    static void runSJF(List<Process> procs) {

        procs.sort(Comparator.comparingInt((Process p) -> p.burst).thenComparingInt(p -> p.id));
        int currentTime = 0;
        double totalWait = 0;
        System.out.println("Process ID | Waiting Time | Turnaround Time");
        for (Process p : procs) {
            p.start = Math.max(currentTime, p.arrival);
            p.completion = p.start + p.burst;
            p.turnaround = p.completion - p.arrival;
            p.waiting = p.start - p.arrival;
            currentTime = p.completion;

            totalWait += p.waiting;
            System.out.format("    %d            |     %d         |      %d%n",
                    p.id, p.waiting, p.turnaround);
        }
        System.out.printf("Average waiting time = %.2f ms%n", totalWait / procs.size());
    }
}