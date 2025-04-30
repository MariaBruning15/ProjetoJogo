import java.util.Scanner;

public class Menu {
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        int entrada;
        System.out.println("Qual jogo deseja jogar? \n Digite '1' para jogar CaçaPalvras \n Digite '2' para jogar Jogo da Descoberta");
        entrada = scanner.nextInt();

        if(entrada == 1){
            CaçaPalavras caçaPalavras = new CaçaPalavras();
            caçaPalavras.CaçaPalavras();
        }
        else if (entrada == 2) {
            JogoDescoberta jogodescoberta = new JogoDescoberta();
            jogodescoberta.JogoDescoberta();
            
        }


    }
}
