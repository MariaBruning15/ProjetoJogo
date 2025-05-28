import java.util.Random;

public class Embaralhar {
    private Random random = new Random();

    public static String embaralhar(String palavra, Random random){
            char[] palavraArray = palavra.toCharArray();
            for(int x=0; x<palavraArray.length; x++){
                int indiceAleatorio = random.nextInt(palavraArray.length);
                char temp = palavraArray[x];
                palavraArray[x] = palavraArray[indiceAleatorio];
                palavraArray[indiceAleatorio] = temp;
            }

            return new String(palavraArray); 
    }
}
