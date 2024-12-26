package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> snacks;

    // Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 3));
        snacks.add(new Snack("Refresco", 2));
        snacks.add((new Snack("Sandwich", 5)));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnack = "";
        for(var snack: snacks){
            inventarioSnack += snack.toString() +"\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnack);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
