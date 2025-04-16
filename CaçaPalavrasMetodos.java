import java.util.Random;

public class CaçaPalavrasMetodos {

    public static void imprimirTabuleiro(char matrizTabuleiro[][], int tamanho){
        
        System.out.println("Encontre a palavra:");
        for(int x = 0; x<tamanho; x++){
            for(int y =0;y<tamanho; y++){
                System.out.print(matrizTabuleiro[x][y] + " ");
            }
            System.out.println(" ");
            
        }
    }

    public static char[][] preencherTabuleiro(char matrizTabuleiroPreencher[][], int tamanho){
        Random random = new Random();

        for(int x = 0; x<tamanho; x++){
            for(int y =0;y<tamanho; y++){
                matrizTabuleiroPreencher[x][y] = (char) ('a'+ random.nextInt(25));
            }
        }
        return matrizTabuleiroPreencher;
    }

    public static void tabuleiro(int tamanho, String palavraSelecionada, char tabuleiro[][]){
        
        Random random = new Random();
        int linha = random.nextInt(tamanho);
        int coluna = random.nextInt(tamanho - palavraSelecionada.length());

        for (int x = 0; x<palavraSelecionada.length(); x++) {
            tabuleiro[linha][coluna+x] = palavraSelecionada.charAt(x);
        }
    }
}
