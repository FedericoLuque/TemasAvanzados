public class ClaseAbstracta {
    public static void main(String[] args) {
       // FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); // Error, no se puede instaciar
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta

abstract class FiguraGeometrica{ // No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un rectangulo");
    }
}
class Circulo extends FiguraGeometrica{
    public void dibujar(){
        System.out.println("Se dibuja un circulo");
    }
}