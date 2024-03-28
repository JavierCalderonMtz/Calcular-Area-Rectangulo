import java.util.Scanner;

public class Area {

    public static void main(String args[]) {

        var consola = new Scanner(System.in);
        
        System.out.println("Ingresa lo alto del rectangulo: ");
        int alto = Integer.parseInt(consola.nextLine());
        
        System.out.println("Ingresa el ancho del rectangulo: ");
        int ancho = Integer.parseInt(consola.nextLine());
        
        var areaRectangulo = alto * ancho;
        var perimetroRectangulo = (alto + ancho) * 2;
        
        System.out.println("El Area del rectangulo es: " + areaRectangulo );
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
    }
}
