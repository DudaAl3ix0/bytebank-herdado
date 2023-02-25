package ByteBankHerdado;
public class Cliente implements Autenticavel{
    private AutenticadorSenha autentificador ;

    public Cliente(){
        this.autentificador = new AutenticadorSenha();
    }

    @Override
    public void setSenha(int senha) {
        this.autentificador.setSenha(senha);
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.autentificador.autenticacao(senha);
    }
 
    
}
