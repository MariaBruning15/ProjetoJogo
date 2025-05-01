import java.util.Scanner;

public class Entrada{

    void Entrada(String palavraSelecionada, Dica dica, Desistir desistir){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
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
                    int continuar = 0;
                    Continuar(continuar, scanner);

                    if(continuar == 1){
                        menu.Menu();
                    }
                    else if(continuar == 2){
                        System.out.println("Fim de jogo");
                        break;
                    }
                    else{
                        System.out.println("Digite um valor válido");
                        Continuar(continuar, scanner);
                    }
                }

                else{
                    tentativas++;
                }
            }
        }

        public int Continuar(int continuar, Scanner scanner){
            System.out.println("Deseja jogar novamente? \n Digite '1' para sim e '2' para não");
            continuar = scanner.nextInt();
            return continuar;
            
        }
    }