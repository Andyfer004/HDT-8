
public class Task implements Comparable<Task> {
    private String proceso;    
    private String usuario;    
    private int nice;       
    private int prioridad;   

    public Task(String proceso, String usuario, int nice) {
        this.proceso = proceso;
        this.usuario = usuario;
        this.nice = nice;
        this.prioridad = 20 + nice + 100; 
    }

    
    public String getProceso() { return proceso; }

    
    public String getUsuario() { return usuario; }

    
    public int getNice() { return nice; }

    
    public int getPrioridad() { return prioridad; }

    
    @Override
    public int compareTo(Task process) {
        return Integer.compare(this.prioridad, process.prioridad);
    }

    @Override
    public String toString() {
        return "- "+proceso + "," + usuario + "," + nice + ",PR=" + prioridad;
    }

}