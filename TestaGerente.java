public class TestaGerente {
    public static void main(String[] args) {
       Gerente matheus = new Gerente();
       matheus.setNome("Matheus Mucci");
       System.out.println(matheus.getNome()); 
       matheus.setSenha(13);

        boolean autenticação = matheus.autenticação(14);
        System.out.println(autenticação);

        matheus.setSalario(7000);
        System.out.println(matheus.getBonificacao()); 

    }
}
