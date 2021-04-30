package SolucionandoDesafiosMatematicosEmJava;

import java.util.Scanner;

public class CalculoViagem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kmL = 12;
        int horas = input.nextInt();
        int velocidadeMedia = input.nextInt();
        int kmPercorridos;
        float litrosConsumidos;

        kmPercorridos = velocidadeMedia * horas;

        litrosConsumidos = (float) kmPercorridos / (float) kmL;

        System.out.printf("%.3f\n", litrosConsumidos);

        input.close();

    }
}
