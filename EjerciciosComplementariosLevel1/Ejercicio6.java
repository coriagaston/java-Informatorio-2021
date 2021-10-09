package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca el numero que desea saber: ");

        int numero2 = scan.nextInt();

        System.out.println("Elevado a: ");

        int numero = scan.nextInt();

        int potencia = 1;

        for(int i=1;i<=numero;i++){

            potencia = potencia * numero2;

        }

        System.out.println("El resultado es "+ potencia);

        scan.close();
    }
    
}
