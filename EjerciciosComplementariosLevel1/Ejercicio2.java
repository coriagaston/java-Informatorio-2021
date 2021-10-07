package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main (String[] args) {

    Scanner scan = new Scanner(System.in); 

    System.out.println("Ingrese dos numeros enteros: ");

    int a = scan.nextInt();

    int b = scan.nextInt();

    int suma = a + b;

    int multiplicaciones = a * b;

    int resta = a - b;

    int division = a / b;

    int modulo = a % b;



    System.out.println("El resultado es: "+ suma);
    
    System.out.println("El resultado es: "+ multiplicaciones);

    System.out.println("El resultado es: "+ resta);

    System.out.println("El resultado es: "+ division);

    System.out.println("El resultado es: "+ modulo);

    scan.close();
}

}
