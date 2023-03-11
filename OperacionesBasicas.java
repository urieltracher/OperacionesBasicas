
package operacionesbasicas;

/**
 *
 * @author tracher
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

import java.util.Scanner;

public class OperacionesBasicas {
    
    int valor1, valor2;
    float suma, resta, multiplicacion, division;

    public void Operaciones(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer valor: ");
        valor1 = input.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        valor2 = input.nextInt();
        
        //Reliza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
        
        //Reliza el cálculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
        
        //Reliza el cálculo de la multiplicación
        multiplicacion = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicacion);
        
        //Reliza el cálculo de la división
        division = (float) valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.Operaciones();
    }
    
}
