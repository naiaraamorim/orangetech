package testes;
import java.util.Scanner;
// mesada do sobrinho
// 50 reias por mês
// entrar com valor pelo teclado 
public class desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int resultado = 0;

        resultado = entrada * mesada;
        System.out.println(resultado);

    }
}
