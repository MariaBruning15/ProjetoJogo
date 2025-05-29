import java.util.Scanner;

public class Entrada{
    private int tentativas = 1;
    private Boolean acertou = false;
    private String continuar;
    private int pediuDica;


    void entrada(String palavraSelecionada, Dica dica, Desistir desistir){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
       
        

        while (true) { 
            if(pediuDica < 2){
                System.out.println("Informe a palavra:\nDigite 'dica' para receber uma dica ou '0' para desistir");
            }
            else if(pediuDica == 2){
                System.out.println("Informe a palavra ou digite '0' para desistir");
            }
            else if(pediuDica > 2){
                System.out.println("SEM MAIS DICAS \nInforme a palavra ou digite '0' para desistir");
            }
            
            String entrada = scanner.nextLine();
                    if(entrada.equals("0")) {
                        desistir.desistir(tentativas);
                        break;
                }

                if(entrada.equals("dica")) {
                    pediuDica = pediuDica + 1;
                    if(pediuDica == 1 ){
                    dica.dica1(palavraSelecionada);
                    continue;
                    }
                    else if(pediuDica == 2){
                    dica.dica2(palavraSelecionada);
                    continue;
                    }
                    else if(pediuDica > 2){
                    System.err.println("Dicas esgotadas!");
                    continue;
                    }
                }
                    
                

                if(entrada.equals(palavraSelecionada)){
                    System.out.println("Você acertou com " + tentativas + " tentativas");
                    acertou = true;
                    System.out.println("Deseja continuar? \n 'Sim' ou 'Não'?");
                    continuar = scanner.nextLine();
                    if(continuar.equals("Sim")){
                        tentativas = 0;
                        menu.menu();

                    }
                    else{
                        System.out.println("Fim de jogo.");
                        break;
                    }

                     
                }
                    
                else{
                    tentativas++;
                }
            }
        }
              }