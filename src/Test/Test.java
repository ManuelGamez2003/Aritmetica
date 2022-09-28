/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import aritmetica.Aritmetica;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Test {

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion <= 0 || opcion >= 5) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Mutiplicar");
            System.out.println("4. Dividir");
            opcion = teclado.nextInt();
        }
        return opcion;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aritmetica aritmetica = new Aritmetica(0, 0);
        int num;
        int num1;
        int opcion;
        opcion = menu();
        switch (opcion) {
            case 1:
                System.out.println("Introduce dos numeros");
                num = teclado.nextInt();
                num1 = teclado.nextInt();
                System.out.println(aritmetica.suma(num, num1));
                break;
            case 2:
                System.out.println("Introduce dos numeros");
                num = teclado.nextInt();
                num1 = teclado.nextInt();
                System.out.println(aritmetica.resta(num, num1));

                break;
            case 3:
                System.out.println("Introduce dos numeros");
                num = teclado.nextInt();
                num1 = teclado.nextInt();
                System.out.println(aritmetica.multiplicacion(num, num1));
                break;
            case 4:
                System.out.println("Introduce dos numeros");
                num = teclado.nextInt();
                num1 = teclado.nextInt();
                if(num1==0){
                    System.out.println("No se puede hacer la division");
                }else{
                System.out.println(aritmetica.division(num, num1));
                }
                break;
        }
    }
}
