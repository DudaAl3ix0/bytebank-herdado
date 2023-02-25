package ByteBankHerdado;

public class Administrador extends Funcionario implements Autenticavel{
    private AutenticadorSenha autentificador;

    public Administrador(){
        this.autentificador = new AutenticadorSenha();
    }

    @Override
    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
        
    }

    
    
    @Override
    public double getBonificacao() {
        return 200;
    }



    @Override
    public boolean autenticacao(int senha) {
       return this.autentificador.autenticacao(senha);
    }
}
