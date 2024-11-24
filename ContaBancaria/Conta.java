public class Conta {
    private ContaBancaria conta;

    public Conta(double saldoInicial) {
        this.conta = new ContaBancaria(saldoInicial > 0? saldoInicial : 0);
    }

    public boolean transfere(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
        if (contaOrigem.getSaldo() >= valor) {
            if (contaOrigem.sacarValor(valor)) {
                return contaDestino.depositarValor(valor);
            }
        }
        return false;
    }

    public double getSaldo() {
        return conta.getSaldo();
    }
}
