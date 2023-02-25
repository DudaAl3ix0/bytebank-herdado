package ByteBankHerdado;
public class TestaGerente {
    public static void main(String[] args) {
        Autenticavel c1 = new Cliente();
        c1.setSenha(2222);


       Gerente matheus = new Gerente();
       matheus.setNome("Matheus Mucci");
       System.out.println(matheus.getNome()); 
       matheus.autenticacao(1344);

        System.out.println(matheus.autenticacao(1344));

        matheus.setSalario(7000);
        System.out.println(matheus.getBonificacao()); 

        SistemaDeAutentificacao sa = new SistemaDeAutentificacao();
        sa.autenticacao(c1);

    }
}
