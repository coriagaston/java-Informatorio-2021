package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args){



        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce un numero: ");

        int numero = scan.nextInt();

        for(int i=1; i <=numero; i++) {
            
            System.out.println(i);

            for (int e = 1; e <=i; e++){

                System.out.print(e);
                
                
            }

}

        scan.close();
    }
    
}
