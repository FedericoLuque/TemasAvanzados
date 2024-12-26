import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // Crear mapa
        Map<String, String> persona = new HashMap<>();
        // Introduce valores
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad","31");
        persona.put("edad","31"); // No se permiten duplicados

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Modificar valores
        persona.put("edad","35");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Eliminar valores
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (clave/valor)");
        persona.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor:" + valor));
    }
}
