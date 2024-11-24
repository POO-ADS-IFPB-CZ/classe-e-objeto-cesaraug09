
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(110);
        ContaBancaria conta2 = new ContaBancaria(200);

        Conta contaOrigem = new Conta(0);
        Conta contaDestino = new Conta(0);

        boolean sucesso = contaOrigem.transfere(conta1, conta2, 100.0);

        if (sucesso) {
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Saldo da conta origem: " + conta1.getSaldo());
            System.out.println("Saldo da conta destino: " + conta2.getSaldo());
        } else {
            System.out.println("Falha na transferência!");
        }
    }
}
