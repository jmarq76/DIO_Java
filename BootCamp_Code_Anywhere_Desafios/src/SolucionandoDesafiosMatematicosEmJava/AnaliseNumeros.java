package SolucionandoDesafiosMatematicosEmJava;

import java.util.Scanner;

public class AnaliseNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++){

            int valor = input.nextInt();

            if (valor % 2 == 0){
                pares++;
            } else {
                impares++;
            }

            if (valor > 0){
                positivo++;
            } else if (valor < 0) {
                negativo++;
            }

        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
