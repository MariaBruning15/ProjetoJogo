import java.util.Scanner;

public class Menu {
    public static void menu(){
        int entrada;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual jogo deseja jogar? \n Digite '1' para jogar CaçaPalvras \n Digite '2' para jogar Jogo da Descoberta");
        entrada = scanner.nextInt();

        if(entrada == 1){
            CaçaPalavras caçaPalavras = new CaçaPalavras();
            caçaPalavras.caçaPalavras();
        }
        else if (entrada == 2) {
            JogoDescoberta jogodescoberta = new JogoDescoberta();
            jogodescoberta.jogoDescoberta();
            
        }
      


    }
}
