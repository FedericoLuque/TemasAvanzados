import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<String>();  // El segundo <String> es redundante, se puede quitar.
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Una lista permite elementos duplicados

        System.out.println("Ciclo for: \n");

        for(Object elemento: miLista){
            System.out.println("elemento = " + elemento);
        }


        System.out.println("\nCiclo forEach: \n");

        // Funciones lambda (funcion anonima de un codigo muy compacto)
        
        miLista.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        } );

        System.out.println("\nCiclo forEach con metodo de referencia: \n");

        miLista.forEach(System.out::println);

        System.out.println("\nCreacion de listas directamente con el metodo .asList: \n");

        List<String> nombres = Arrays.asList("Pedro","Miriam", "Rocio");

        nombres.forEach(System.out::println);
        
    }
}
