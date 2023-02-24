package Funcionarios;
public class Gerente extends FuncionarioAutenticavel {

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do gerente");
        return super.getSalario();
    }

}
