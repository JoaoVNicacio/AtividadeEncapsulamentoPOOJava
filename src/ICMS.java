
public class ICMS extends Imposto {
  public ICMS(Imposto outroImposto) {
      super(outroImposto);
  }

  public ICMS() {
      super();
  }

  @Override
  public double calcularImposto(Orcamento orcamento) {
      return orcamento.getValor() * 0.05 + 50 + calcularOutroImposto(orcamento);
  }
}