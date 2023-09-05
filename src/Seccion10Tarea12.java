import java.util.Scanner;

public class Seccion10Tarea12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo");
        double radio = s.nextInt();
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El resultado del circulo es de  = " + area);
    }
}