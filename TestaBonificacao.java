
import Funcionarios.Gerente;

public class TestaBonificacao{
    public static void main(String[] args) {
        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(1200);
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getBonificacao());
    }
}