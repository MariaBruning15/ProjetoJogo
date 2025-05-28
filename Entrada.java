import java.util.Scanner;

public class Entrada{
    private int tentativas = 1;
    private Boolean acertou = false;

    void entrada(String palavraSelecionada, Dica dica, Desistir desistir){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
       
        

        while (true) { 
            System.out.println("Informe a palavra \n'dica' para receber uma dica ou '0' para desistir");
                    String entrada = scanner.nextLine();
                    if(entrada.equals("0")) {
                        desistir.desistir(tentativas);
                    break;
                }

                if(entrada.equals("dica")) {
                    dica.dica(palavraSelecionada);
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