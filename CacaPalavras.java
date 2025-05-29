import java.util.Random;
import java.util.Scanner;

public class CacaPalavras {
    private int tamanho = 10;
    private char tabuleiro[][] = new char[tamanho][tamanho];

    public void cacaPalavras() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GerarPalavras palavras = new GerarPalavras();
        CacaPalavrasMetodos metodos = new CacaPalavrasMetodos();
        Entrada entrada = new Entrada();
        Dica dica = new Dica();
        Desistir desistir = new Desistir();

        String palavraSelecionada = palavras.getPalavras()[random.nextInt(palavras.getPalavras().length)];

        metodos.preencherTabuleiro(tabuleiro, tamanho);
        metodos.imprimirTabuleiro(tabuleiro, tamanho);

        entrada.entrada(palavraSelecionada, dica, desistir);


        

        

    }




}


