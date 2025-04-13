import java.util.Random;

public class CaçaPalavrasMetodos {

    public static void imprimirTabuleiro(char matrizTabuleiro[][], int tamanho){
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
}
