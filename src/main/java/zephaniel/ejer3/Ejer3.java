/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zephaniel.ejer3;

import Dependencias.Operacion;
import java.util.Scanner;

/**
 *
 * @author Zephaniel
 */
public class Ejer3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Operacion o1 = new Operacion();
        System.out.println("Ingrese el primer numero: ");
        o1.setNumero1(sc.nextInt());
        System.out.println("Ingrese el segundo numero: ");
        o1.setNumero2(sc.nextInt());
        System.out.println("Los resultados de las operaciones son: ");
        System.out.println("SUMA: " + o1.sumar());
        System.out.println("RESTA: " + o1.restar());
        System.out.println("MULTIPLICACION: " + o1.multiplicar());
        System.out.println("DIVISION: " + o1.dividir());
    }
}
