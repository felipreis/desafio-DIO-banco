import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        Cliente clienteUm = new Cliente();
        Cliente clienteDois = new Cliente();
        clienteUm.setNome("Felipe");
        clienteDois.setNome("Mariana");

        Conta contaCorrente = new ContaCorrente(clienteUm);
        Conta contaPoupanca = new ContaPoupanca(clienteDois);

        contaCorrente.depositar(200.00);
        contaCorrente.transferir(145.50, contaPoupanca);

        contaPoupanca.sacar(75.00);

        //contaCorrente.exibirExtrato();
        //contaPoupanca.exibirExtrato();

        Banco.lista(contaCorrente,contaPoupanca);





    }


}
