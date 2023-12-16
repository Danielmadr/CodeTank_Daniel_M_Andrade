import java.util.Scanner;

public class Questao1 {

  public static void main(String[] args) {
    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual o valor do empréstimo: ");
    double valorEmprestimo = scanner.nextDouble();
    System.out.print("Informe a taxa de juros: ");
    double taxaJuros = scanner.nextDouble();
    System.out.print("Informe o tempo (em meses) para o pagamento: ");
    double parcelamento = scanner.nextDouble();
    scanner.close();

    //calculos iniciais
    taxaJuros = taxaJuros / 100; // tranforma a taxa de juros em porcentagem
    final double amortizacao = valorEmprestimo / parcelamento; //calculo da amortização (constante)

    //função que gera a tabela deparcelamento
    parcelamento(amortizacao, parcelamento, valorEmprestimo, taxaJuros);
  }

  public static void parcelamento(
    double amot,
    double parc,
    double salDev,
    double txJu
  ) {
    //variaveis para o for
    double totPagoJuros = 0;
    double totPagoPrestacoes = 0;
    double totAmortizado = 0;
    double juros = 0;
    double prestacao = 0;

    //imprime a tabela de parcelas
    for (int mes = 1; mes <= parc; mes++) {
      juros = salDev * txJu;
      prestacao = juros + amot;
      salDev -= amot;

      totPagoJuros += juros;
      totPagoPrestacoes += prestacao;
      totAmortizado += amot;

      System.out.printf(
        "%nParcela %d | Juros: %.2f | Prestação: %.2f | Saldo devedor: %.2f%n",
        mes,
        juros,
        prestacao,
        salDev
      );
    }
    //dados acumulados
    System.out.printf(
      "%nTotal: Prestações: R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n%n",
      totPagoPrestacoes,
      totPagoJuros,
      totAmortizado
    );
  }
}
