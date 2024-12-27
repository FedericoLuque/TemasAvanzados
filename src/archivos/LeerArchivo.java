package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer el archivo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del Archivo: ");
            // Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            // Leemos el archivo linea a linea
            var linea = entrada.readLine();
            // Leemos todas las lineas
            while(linea != null){
                System.out.println(linea);
                // antes de terminar el ciclo, nos movemos a la siguiente linea
                linea = entrada.readLine();
            }
            // Cerrar archivo
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer el archivo: " + e);
        }

    }
}
