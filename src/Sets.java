import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos");     // Elemento duplicado
        conjunto.add("Juan");
        conjunto.add("Victoria");

        System.out.println("Elementos del Set: ");

        conjunto.forEach(System.out::println);

        conjunto.remove("Juan");

        System.out.println("\nNuevos elementos del set:");
        conjunto.forEach(System.out::println);
    }
}
