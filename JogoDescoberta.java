import java.util.Random;
import java.util.Scanner;

public class JogoDescoberta {
    public void JogoDescoberta() {
        System.out.println("Bem-vindo ao Jogo da Descobeta");

        GerarPalavras palavras = new GerarPalavras();
        Random random = new Random();
        String palavraSelecionada = palavras.palavras[random.nextInt(palavras.palavras.length)];
        Embaralhar embaralhar = new Embaralhar();
        Entrada entrada = new Entrada();
        Dica dica = new Dica();
        Desistir desistir = new Desistir();


        String palavraEmbaralhada = embaralhar.embaralhar(palavraSelecionada);

        System.out.println("Qual a palavra " + palavraEmbaralhada + "?");
        

        entrada.Entrada(palavraSelecionada, dica, desistir);

        Scanner scanner = new Scanner(System.in);

        

    }
    
    
}
 