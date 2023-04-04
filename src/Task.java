
public class Task implements Comparable<Task> {
    private String proceso;    
    private String usuario;    
    private int nice;       
    private int prioridad;

    /**
     * realiza el calculo de la prioridad dependiendo del nice
     * @param proceso
     * @param usuario
     * @param nice
     */
    public Task(String proceso, String usuario, int nice) {
        this.proceso = proceso;
        this.usuario = usuario;
        this.nice = nice;
        this.prioridad = 20 + nice + 100; 
    }

    /**
     *  devuelve el nombre del proceso
     * @return
     */
    public String getProceso() { return proceso; }

    /**
     * devuelve el nombre del usuario
     * @return
     */
    public String getUsuario() { return usuario; }

    /**
     * devuelve el valor de nice
     * @return
     */
    public int getNice() { return nice; }

    /**
     * devuelve el valor de la prioridad
     * @return
     */
    public int getPrioridad() { return prioridad; }

    /**
     * compara la prioridad de los procesos
     * @param process
     * @return
     */
    @Override
    public int compareTo(Task process) {
        return Integer.compare(this.prioridad, process.prioridad);
    }

    /**
     * devuelve el nombre del proceso, el nombre del usuario, el valor de nice y el valor de la prioridad
     * @return
     */
    @Override
    public String toString() {
        return "- "+proceso + "," + usuario + "," + nice + ",PR=" + prioridad;
    }

}