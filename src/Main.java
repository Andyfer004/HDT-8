import java.io.IOException;
import java.util.List;
import java.util.Scanner;
/**
UNIVERSIDAD DEL VALLE DE GUATEMALA
ALRGORITMOS Y ESTRUCTURAS DE DATOS
Descripcion: Hoja de trabajo 8 ADT Priority Queue
Autor: GABRIEL PAZ & ANDY FUENTES
Fecha: 29/03/2023
*/


public class Main {
    /**Empieza el programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Se lee el archivo y se almacenan los procesos en una lista
         * Se le pregunta al usuario que implementacion desea utilizar
         * Se le muestra al usuario los procesos ordenados
         */
        String archivo = "procesos.txt";
        Scanner scanner = new Scanner(System.in);
        List<Task> procesosEnlistados;

        try {
            procesosEnlistados = TaskDataReader.getProcesos(archivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            return;
        }
        System.out.println(" ");
        System.out.println("-------- ChichicasteLinux--------");
        System.out.println("Seleccione porfavor que implementacion desea utilizar:");
        System.out.println("1. JCF PriorityQueue");
        System.out.println("2. VectorHeap");
        System.out.println("3. Salir");
        
        int option = scanner.nextInt();
/**
 * se realiza un switch para que el usuario pueda elegir la implementacion que desea utilizar
 */
        while(option!=3){
            
            switch (option){
                case 1:
                    for (Task process: PriorityController.usingPriorityQueueJCF(procesosEnlistados)){
                        System.out.println(process.toString());
                    }
                    System.out.println("------------------------------------------------");
                    System.out.println("implementacion utilizada: (JCF PriorityQueue)");
                    break;
                case 2:
                    
                    for (Task process: PriorityController.usingVectorHeap(procesosEnlistados)){
                        System.out.println(process.toString());
                    }   
                    System.out.println("------------------------------------------------");
                    System.out.println("implementacion utilizada: (VectorHeap)");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa opcion no se encuentra dentro del menu");
                
                
            }
            System.out.println(" ");
            System.out.println("-------- ChichicasteLinux--------");
            System.out.println("Seleccione porfavor que implementacion desea utilizar:");
            System.out.println("1. JCF PriorityQueue");
            System.out.println("2. VectorHeap");
            System.out.println("3. Salir");
                    
            option = scanner.nextInt();
        }
    }
}