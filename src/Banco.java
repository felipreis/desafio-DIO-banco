import java.util.ArrayList;
import java.util.List;

public class Banco {
   
    public static void lista(Conta contaUm, Conta contaDois){
        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(contaUm);
        listaContas.add(contaDois);

        System.out.println("=== Lista Contas ===");
        for(Conta conta : listaContas){
            System.out.println(String.format("Titular: %s", conta.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", conta.agencia));
            System.out.println(String.format("Numero: %d", conta.numeroConta));
            System.out.println(String.format("Saldo: %.2f", conta.saldo));
        }
    }
        
}
