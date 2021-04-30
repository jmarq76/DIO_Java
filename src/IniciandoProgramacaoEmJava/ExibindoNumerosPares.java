package IniciandoProgramacaoEmJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExibindoNumerosPares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        List<Integer> pares = new ArrayList<>();


        for (int i = 0; i < numero; i++){

            int parImpar = numero - i;
            if (parImpar % 2 == 0) {
                pares.add(parImpar);
            }

        }
        Collections.sort(pares);
        for (int par: pares){
            System.out.println(par);

        }
    }
}
