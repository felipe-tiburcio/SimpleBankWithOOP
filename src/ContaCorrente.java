public class ContaCorrente extends Conta {

  public void depositar(double valor) {

  }

  public void transferir(double valor, Conta contaDestino) {

  }

  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirInfosComuns();
  }

}
