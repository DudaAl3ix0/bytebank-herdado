package ByteBankHerdado;
//Quem assina o contrato com a interface deve implementar o método.
//Só define regras que devem ser implementadas por quem assina o contrato.
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autenticacao(int senha);
}
