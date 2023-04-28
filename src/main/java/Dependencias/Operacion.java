/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependencias;

/**
 *
 * @author Zephaniel
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        int r = numero1 + numero2;
        return r;

    }

    public int restar() {
        int r = numero1 - numero2;
        return r;

    }

    public int multiplicar() {
        int res;

        if (numero2 > 0) {
            res = numero1 * numero2;
        } else {
            System.out.println("NO se puede por 0.");
            res = 0;
        }
        return res;
    }
     public double dividir() {
        double res;

        if (numero2 > 0) {
            res = numero1 / numero2;
        } else {
            System.out.println("NO se puede por 0.");
            res = 0;
        }
        return res;
    }
}
