public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 001;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;

  public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  protected void imprimirInfosComuns() {
      System.out.printf("Agência: %d", this.agencia);
      System.out.printf("Numero: %d", this.numero);
      System.out.printf("Saldo: %.2f", this.saldo);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println(this.saldo);
  }
}
