import java.util.Random;
import java.util.Scanner;

public class CaçaPalavras {
    public void caçaPalavras() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GerarPalavras palavras = new GerarPalavras();
        CaçaPalavrasMetodos metodos = new CaçaPalavrasMetodos();
        Entrada entrada = new Entrada();
        Dica dica = new Dica();
        Desistir desistir = new Desistir();

        int tamanho = 10;
        char tabuleiro[][] = new char[tamanho][tamanho];

        String palavraSelecionada = palavras.palavras[random.nextInt(palavras.palavras.length)];

        metodos.preencherTabuleiro(tabuleiro, tamanho);
        metodos.imprimirTabuleiro(tabuleiro, tamanho);

        entrada.entrada(palavraSelecionada, dica, desistir);


        

        

    }




}


