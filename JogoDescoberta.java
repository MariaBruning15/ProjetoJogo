import java.util.Random;
import java.util.Scanner;

public class JogoDescoberta {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Jogo da Descobeta");

        GerarPalavras palavras = new GerarPalavras();
        Random random = new Random();
        String palavraSelecionada = palavras.palavras[random.nextInt(palavras.palavras.length)];
        Embaralhar embaralhar = new Embaralhar();
        Entrada entrada = new Entrada();

        String palavraEmbaralhada = embaralhar.embaralhar(palavraSelecionada);

        System.out.println("Qual a palavra " + palavraEmbaralhada + "?");
        

        entrada.entrada(palavraSelecionada);

        Scanner scanner = new Scanner(System.in);

        

    }
    
    
}
 