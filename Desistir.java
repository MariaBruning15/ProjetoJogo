public class Desistir {
    public void desistir(int tentativas){
        if(tentativas == 1){
            System.out.println("Desistiu com apenas 1 tentativa? Sério?");
        }
        else{
        System.out.println("Desistiu com " + tentativas + " tentativas");
        }
    }
}
