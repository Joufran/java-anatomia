public class MinhaClasse {
  
    public static void main(String[] args) {
       System.out.println("Olá turma, sejam bem vindos!");

        String primeiroNome = "Marcelo";
        String segundoNome = "cruz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome.concat(segundoNome);
    
}

}
