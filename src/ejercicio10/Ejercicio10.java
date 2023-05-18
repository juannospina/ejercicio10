/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        int num;
        System.out.println("Ingresa 4 nùmeros comprendidos entre 1 y 20: ");
        for (int i = 0; i < 4; i++) {
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();
            if(num > 0 && num < 21){
                for (int j = 0; j < num; j++){                
                System.out.print("*");
                }
            }else{
                System.out.print("Error, solo se permite el ingreso de números comprendidos entre 1 y 20, vuelve a intentarlo: ");
                num = leer.nextInt();
                for (int j = 0; j < num; j++){                
                System.out.print("*");
                }
            }
            System.out.println(""); //salto de lìnea
        }    
    }    
}
