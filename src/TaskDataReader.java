import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskDataReader {
    /**
     * Lee el archivo y almacena los procesos en una lista
     * @param file
     * @return
     * @throws IOException
     */
    public static List<Task> getProcesos(String file) throws IOException {
        List<Task> procesos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] slpitted = linea.split(",");
                String proceso = slpitted[0];
                String usuario = slpitted[1];
                int nice = Integer.parseInt(slpitted[2]);
                procesos.add(new Task(proceso, usuario, nice));
            }
        }
        return procesos;
    }
}