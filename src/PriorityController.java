import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class PriorityController {
/**
     * Ordena los procesos por prioridad
     * @param procesos
     * @return
     */
    public static List<Task> usingPriorityQueueJCF(List<Task> procesos) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(procesos);

        List<Task> sortedProcesses = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            sortedProcesses.add(priorityQueue.poll());
        }
        return sortedProcesses;
    }
/**
     * Ordena los procesos por prioridad
     * @param procesos
     * @return
     */
    public static List<Task> usingVectorHeap(List<Task> procesos){
        
        VectorHeap<Task> vectorHeap = new VectorHeap<>();

        for (Task proceso : procesos) {
            vectorHeap.insert(proceso);
        }
        List<Task> sortedProcesses = new ArrayList<>();
        while (!vectorHeap.isEmpty()) {
            sortedProcesses.add(vectorHeap.remove());
        }
        return sortedProcesses;
    }
}