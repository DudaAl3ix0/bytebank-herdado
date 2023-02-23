import Funcionarios.EditorVideo;
import Funcionarios.Funcionario;
import Funcionarios.Gerente;

public class TestaReferencia {
    public static void main(String[] args) {
      Gerente g1 = new Gerente();
      g1.setSalario(5000);

      Funcionario f1 = new Funcionario();
      f1.setSalario(2000);

      EditorVideo eV1 = new EditorVideo();
      eV1.setSalario(2500);

      ControleBonificacao controle = new ControleBonificacao();
      controle.registraBoni(g1);
      controle.registraBoni(f1);
      controle.registraBoni(eV1);

      System.out.println(controle.getSomaDosRegistros());
    }
}
