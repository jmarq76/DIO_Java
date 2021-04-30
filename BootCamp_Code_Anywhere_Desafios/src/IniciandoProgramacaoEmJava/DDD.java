package IniciandoProgramacaoEmJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<Integer, String> listaDDD = new HashMap<Integer, String>();

        listaDDD.put(61, "Brasilia");
        listaDDD.put(71, "Salvador");
        listaDDD.put(11, "Sao Paulo");
        listaDDD.put(21, "Rio de Janeiro");
        listaDDD.put(32, "Juiz de Fora");
        listaDDD.put(19, "Campinas");
        listaDDD.put(27, "Vitoria");
        listaDDD.put(31, "Belo Horizonte");

        int nDDD = input.nextInt();

        if (listaDDD.containsKey(nDDD)){
            System.out.println(listaDDD.get(nDDD));
        } else {
            System.out.println("DDD nao cadastrado");
        }

        input.close();
    }
}
