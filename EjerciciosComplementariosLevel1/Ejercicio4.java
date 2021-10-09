package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca el numero que desea saber: ");

        double numero = scan.nextDouble();

        int fact = 1;

        for(int i=1 ;i<=numero; i++) {
            
            fact*= i;
            

        }

        System.out.println("El factoria es de " +fact);

        scan.close();


}
}