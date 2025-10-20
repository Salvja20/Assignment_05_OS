public class Process {
    int id;
    int burst;
    int arrival; // all zero here
    int start;
    int completion;
    int waiting;
    int turnaround;

    Process(int id, int burst, int arrival) {
        this.id = id;
        this.burst = burst;
        this.arrival = arrival;
    }

    Process copy() {
        return new Process(id, burst, arrival);
    }
}
