import java.util.Random;
import java.util.Scanner;

public class CaçaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        GerarPalavras palavras = new GerarPalavras();
        CaçaPalavrasMetodos metodos = new CaçaPalavrasMetodos();
        Entrada entrada = new Entrada();

        int tamanho = 10;
        char tabuleiro[][] = new char[tamanho][tamanho];

        String palavraSelecionada = palavras.palavras[random.nextInt(palavras.palavras.length)];

        metodos.preencherTabuleiro(tabuleiro, tamanho);
        metodos.imprimirTabuleiro(tabuleiro, tamanho);

        int linha = random.nextInt(tamanho);
        int coluna = random.nextInt(tamanho - palavraSelecionada.length());

        for (int x = 0; x<palavraSelecionada.length(); x++) {
            tabuleiro[linha][coluna+x] = palavraSelecionada.charAt(x);
        }
        metodos.imprimirTabuleiro(tabuleiro, tamanho);

        entrada.entrada(palavraSelecionada);


        

        

    }




}


