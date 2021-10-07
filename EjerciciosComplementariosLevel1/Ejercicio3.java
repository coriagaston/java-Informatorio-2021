package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        System.out.println("Introduce un numero: ");

        for(int i=1; i <=numero; i++) {

            System.out.println(i);
}

        scan.close();
    }
    
}
