package ByteBankHerdado;
public class TestaReferencia {
    public static void main(String[] args) {
      Gerente g1 = new Gerente();
      g1.setSalario(5000);

      Gerente f1 = new Gerente();
      f1.setSalario(2000);

      EditorVideo eV1 = new EditorVideo();
      eV1.setSalario(2500);

      Gerente g2 = new Gerente();
      g2.setSalario(6000);

      ControleBonificacao controle = new ControleBonificacao();
      controle.registraBoni(g1);
      controle.registraBoni(f1);
      controle.registraBoni(eV1);
      controle.registraBoni(g2);

      System.out.println(controle.getSomaDosRegistros());
    }
}
