package ByteBankHerdado;
public class SistemaDeAutentificacao {
    private int senha = 1344;

    public void autenticacao(Autenticavel fa){
       boolean autenticou = fa.autenticacao(this.senha);
       if(autenticou == true){
            System.out.println("Bem-vindo ao sistema ");
       }else{
        System.out.println("Autentificação incorreta");
       }
    }
}
