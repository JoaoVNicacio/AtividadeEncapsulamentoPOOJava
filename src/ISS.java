
public class ISS extends Imposto {
  public ISS(Imposto outroImposto) {
    super(outroImposto);
  }

  public ISS() {
    super();
  }

  @Override
  public double calcularImposto(Orcamento orcamento) {
    return orcamento.getValor() * 0.06 + calcularOutroImposto(orcamento);
  }
}