package SolucionandoDesafiosMatematicosEmJava;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;
        double raio, area;

        raio = input.nextDouble();

        area = PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        input.close();

    }
}
