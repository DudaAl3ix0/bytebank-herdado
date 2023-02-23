import Funcionarios.Funcionario;

public class TestaBonificacao{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setSalario(1200);
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.getBonificacao());
    }
}