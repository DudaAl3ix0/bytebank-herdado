package ByteBankHerdado;
public class ControleBonificacao {

    private double somaDosRegistros;
    

    public void registraBoni(Funcionario f){
        double boni = f.getBonificacao();
        this.somaDosRegistros = this.somaDosRegistros + boni;
    }
    

    public double getSomaDosRegistros() {
        return somaDosRegistros;
    }
}
