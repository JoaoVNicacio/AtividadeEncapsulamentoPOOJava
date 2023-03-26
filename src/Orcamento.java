import java.util.List;

public class Orcamento {
  private double valor;
  private List<Produto> produtos;

  public Orcamento(double valor, List<Produto> produtos) {
    this.valor = valor;
    this.produtos = produtos;
  }

  public double getValor() {
    return valor;
  }

  public List<Produto> getProdutos() {
    return produtos;
  }
}