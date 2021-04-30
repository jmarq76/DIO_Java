package SolucionandoDesafiosMatematicosEmJava;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int multiplacador = input.nextInt();
        int verMultiplo = input.nextInt();

        if ( verMultiplo % multiplacador == 0 || multiplacador % verMultiplo == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
