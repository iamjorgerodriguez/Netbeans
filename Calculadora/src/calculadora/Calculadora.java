
package calculadora;

import java.util.Scanner;

/**
 * @author Jorge Rodríguez-Caro Molero
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int opcion, num1, num2, operacion;
        
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        opcion=teclado.nextInt();
        
        System.out.println("Introduce el primer número");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo número");
        num2=teclado.nextInt();
        
        switch (opcion){
            case 1:
                operacion=num1+num2;
                System.out.println("La suma de los números es: "+operacion);
            break;
            case 2:
                operacion=num1-num2;
                System.out.println("La resta de los números es: "+operacion);
            break;
            case 3:
                operacion=num1*num2;
                System.out.println("El resultado de la multiplicación es: "+operacion);
            break;
            case 4:
                operacion=num1/num2;
                System.out.println("El resultado de la división es: "+operacion);
            break;
        }
    }
}
