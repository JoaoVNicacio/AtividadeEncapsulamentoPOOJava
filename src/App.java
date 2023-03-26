import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Imposto impostos = new ICMS(new ISS(new ICCC()));

    List<Produto> listaDeProdutos = new ArrayList<>();
    listaDeProdutos.add(new Produto("Teclado", 250));
    listaDeProdutos.add(new Produto("Monitor", 750));

    Orcamento orcamento = new Orcamento(1000, listaDeProdutos);

    System.out.println("Valor dos Impostos");
    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    calculadorDeImposto.calcularTributo(orcamento, impostos);
  }
}
