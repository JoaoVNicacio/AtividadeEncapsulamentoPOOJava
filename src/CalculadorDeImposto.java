
public class CalculadorDeImposto {
  public void calcularTributo(Orcamento orcamento, Imposto imposto) {
    double valorImposto = imposto.calcularImposto(orcamento);
    System.out.printf("O valor dos impostos é: R$%.2f%n", valorImposto);
  }
}