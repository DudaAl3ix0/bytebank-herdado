package Funcionarios;

public class Cliente implements Autenticavel{
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticacao(int senha) {
        if(this.senha == senha){
            System.out.println("Bem-vindo ao sistema!");
            return true;
        }else{
            System.out.println("Senha incorreta!");
            return false;
        }
    }
 
    
}
