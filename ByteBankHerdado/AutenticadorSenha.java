package ByteBankHerdado;
public class AutenticadorSenha  {
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autenticacao(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }
}
