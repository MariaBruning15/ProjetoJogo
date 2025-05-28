import java.util.Random;
import java.util.Scanner;

public class JogoDescoberta {
    private Random random = new Random();

    public void jogoDescoberta() {
        System.out.println("Bem-vindo ao Jogo da Descobeta");

        GerarPalavras palavras = new GerarPalavras(); 
        String palavraSelecionada = palavras.getPalavras()[random.nextInt(palavras.getPalavras().length)];       
        Embaralhar embaralhar = new Embaralhar();
        Entrada entrada = new Entrada();
        Dica dica = new Dica();
        Desistir desistir = new Desistir();


        String palavraEmbaralhada = embaralhar.embaralhar(palavraSelecionada, random);

        System.out.println("Qual a palavra " + palavraEmbaralhada + "?");
        

        entrada.entrada(palavraSelecionada, dica, desistir);

        Scanner scanner = new Scanner(System.in);

        

    }
    
    
}
 