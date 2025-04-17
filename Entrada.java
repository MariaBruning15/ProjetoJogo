import java.util.Scanner;

public class Entrada{

    void Entrada(String palavraSelecionada, Dica dica, Desistir desistir){
        Scanner scanner = new Scanner(System.in);
        int tentativas = 1;
        Boolean acertou = false;

        while (true) { 
            System.out.println("Informe a palavra \n'dica' para receber uma dica ou '0' para desistir");
                    String entrada = scanner.nextLine();
                    if(entrada.equals("0")) {
                        desistir.Desistir(tentativas);
                    break;
                }

                if(entrada.equals("dica")) {
                    dica.Dica(palavraSelecionada);
                    continue;
                }

                if(entrada.equals(palavraSelecionada)){
                    System.out.println("Você acertou com " + tentativas + " tentativas");
                    acertou = true;
                    break;
                }

                else{
                    tentativas++;
                }
            }
        }
    }