package ByteBankHerdado;
//Gerenta herda os atributos de Funcionario e assina contrato / ou é com Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private AutenticadorSenha autentificador;

    public Gerente(){
        this.autentificador = new AutenticadorSenha();
    }

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
       this.autentificador.setSenha(senha);;
    }

    @Override
    public boolean autenticacao(int senha) {
        return this.autentificador.autenticacao(senha);
    }

}
