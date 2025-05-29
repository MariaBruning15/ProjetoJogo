public class Dica {
    void dica1(String palavraSelecionada){
        System.out.println("A primeira letra é '" + palavraSelecionada.charAt(0) + "', a última é '" + palavraSelecionada.charAt(palavraSelecionada.length() - 1) + "'");
    }
    void dica2(String palavraSelecionada){
        System.out.println("A segunda letra é '" + palavraSelecionada.charAt(1) + "', a penúltima é '" + palavraSelecionada.charAt(palavraSelecionada.length() - 2) + "'");
    }
}
