public class ContaBancaria {
    private long conta;
    private double saldo = 0;

    public double getSaldo(){
        return saldo;
    }

    public void adicionar(double valor){
        if(valor > 0)
            this.saldo += valor;
    }
}
