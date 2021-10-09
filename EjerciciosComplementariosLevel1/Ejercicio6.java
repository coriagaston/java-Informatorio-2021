package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca el numero que desea saber: ");

        int numero = scan.nextInt();

        int numero2 = scan.nextInt();

        int potencia = 0;

        for(int i=0;i!=numero;i++){

            potencia = numero*(numero2);

        }

        System.out.println("La potencia es: "+potencia);

        scan.close();
    }
    
}
