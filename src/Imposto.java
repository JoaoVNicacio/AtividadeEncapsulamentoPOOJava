
public abstract class Imposto {
  protected final Imposto outroImposto;

  public Imposto(Imposto outroImposto) {
    this.outroImposto = outroImposto;
  }

  public Imposto() {
    this.outroImposto = null;
  }

  protected double calcularOutroImposto(Orcamento orcamento) {
    if (outroImposto == null)
      return 0;
    return outroImposto.calcularImposto(orcamento);
  }

  public abstract double calcularImposto(Orcamento orcamento);
}