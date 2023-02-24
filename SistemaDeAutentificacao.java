import Funcionarios.FuncionarioAutenticavel;

public class SistemaDeAutentificacao {
    private int senha = 1344;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void autenticacao(FuncionarioAutenticavel fa){
       boolean autenticou = fa.autenticacao(this.senha);
       if(autenticou == true){
            System.out.println("Bem-vindo ao sistema " + fa.getNome());
       }else{
        System.out.println("Autentificação incorreta");
       }
    }
}
