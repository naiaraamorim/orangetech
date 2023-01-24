package testes;
import java.util.Scanner;

/**
 * a prefeitura não deu conta de enviar as multas necessárias 
 * para quem ultrapassasse a velocidade permitida de 60km/h.
 * 
 *  O seu papel será o de criar um programa que 
    verifique os dados recebidos da câmera e envie uma mensagem 
    dizendo se o motorista será multado ou não.
 */

public class industriaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if (velocidadeAtual > 60) {
            System.out.println("Foi multado");
        } else {
            System.out.println("Nao foi multado");
        }

    }
}
