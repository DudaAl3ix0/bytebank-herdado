import Funcionarios.Administrador;
import Funcionarios.Gerente;

public class TestaAutentica {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1344);
        g.setNome("Carlos");

        Administrador adm = new Administrador();
        adm.setNome("Maria");
        adm.setSenha(1344);


        SistemaDeAutentificacao sa = new SistemaDeAutentificacao();
        sa.autenticacao(g);
        sa.autenticacao(adm);
    }
}
