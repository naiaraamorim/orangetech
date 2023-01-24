package testes;
import java.util.Scanner;
/**
 * Cada 1 real irá render 2 doces aleatórios.
 */

public class Loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int doce = 2;
        int resultado;

        resultado = dinheiro * doce;
        System.out.println("O cliente obteve " + resultado + " doces" );

    }
}
