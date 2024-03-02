public class ContaCorrente {
    private String nomeTitular;
    private double saldo;
    public ContaCorrente(String nomeTitular, int numeroConta, String email, String telefone) {
        this.nomeTitular = nomeTitular;
        this.saldo = 100;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (destino != null && valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada para " + destino.getNomeTitular() + ".");
        } else {
            System.out.println("Transferência inválida ou saldo insuficiente.");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}