

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected double saldo;
    protected int agencia;
    protected int numeroConta;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia =Conta.AGENCIA_PADRAO ;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    @Override
    public void exibirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("NAO TEM SALDO SUFICIENTE PARA SAQUE");
        }else{
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor < saldo){
            saldo -= valor;
            contaDestino.depositar(valor);
        }else{
            System.out.println("NAO TEM SALDO SUFICIENTE PARA TRANSFERÊNCIA");
        }
    }

    public double getSaldo(){
        return saldo;
    }

    public double getNumeroConta(){
        return numeroConta;
    }

    public double getAgencia(){
        return agencia;
    }
    
    
}
