import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Define the processes as in Q2 (IDs 1..5)
        List<Process> processes = Arrays.asList(
                new Process(1, 2, 0),
                new Process(2, 1, 0),
                new Process(3, 8, 0),
                new Process(4, 4, 0),
                new Process(5, 5, 0)
        );

        System.out.println("----------------- FCFS -----------------");
        SchedulingCalc.runFCFS(SchedulingCalc.cloneList(processes));

        System.out.println();
        System.out.println("----------------- SJF (nonpreemptive) -----------------");
        SchedulingCalc.runSJF(SchedulingCalc.cloneList(processes));
    }
}



