package SolucionandoDesafiosMatematicosEmJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        double salary = 1 * 1; // Altere o valor da variável com o cálculo esperado

        salary = valor3 * valor2;
        System.out.println("NUMBER = " + valor1);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
