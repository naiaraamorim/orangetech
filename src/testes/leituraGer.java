package testes;
import java.util.Scanner;
/*
 * um aplicativo que dissesse para ela, 
 * de acordo com o número de páginas de um livro, 
 * quanto tempo ela levaria para ler lendo apenas 3 páginas por dia
 */

public class leituraGer {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int resultado = 0;

        resultado = paginas / paginasLidas;
        System.out.println(resultado + " dias");


    }
}
