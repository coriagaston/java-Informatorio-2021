package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca los numeros a multiplicar: ");

        int numero = scan.nextInt();

        int numero2 = scan.nextInt();

        int mul = 0;

        for (int i=0; i!=numero2; i++){

            mul += numero;

        }

        System.out.println("El resultado es: " + mul);
        scan.close();
    }
    
}
