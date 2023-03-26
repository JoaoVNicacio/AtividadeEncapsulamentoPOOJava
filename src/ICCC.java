
public class ICCC extends Imposto {
  public ICCC(Imposto outroImposto) {
    super(outroImposto);
  }

  public ICCC() {
    super();
  }

  @Override
  public double calcularImposto(Orcamento orcamento) {
    double cota = 0;

    if (orcamento.getValor() < 1000) {
      cota = orcamento.getValor() * 0.05;
    } else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
      cota = orcamento.getValor() * 0.07;
    } else if (orcamento.getValor() > 3000) {
      cota = orcamento.getValor() * 0.08 + 30;
    }

    return cota + calcularOutroImposto(orcamento);
  }
}