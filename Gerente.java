public class Gerente extends Funcionario {
    private int senha;

    /*public double getBonificacao(){
        return this.salario + this.salario;
    } */

    public int getSenha() {
        return this.senha;
    }
    public void setSenha(int senha) {
        if(senha == 13){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
        this.senha = senha;
    }


    public boolean autenticação(int senha){
        if(this.senha == senha ){
            return true;
        }else{
            return false;
        }
    }

}
