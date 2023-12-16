import java.util.Scanner;

public class Questão3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Digite um número inteiro: ");
    int tamanho = scanner.nextInt();
    scanner.close();

    System.out.println("Triangulo 1:");
    Triangulo(tamanho);
    System.out.println();
    System.out.println("Triangulo 2:");
    Triangulo2(tamanho);
  }

  public static void Triangulo(int tamanho) {
    for (int i = 1; i <= tamanho; i += 2) {
      for (int j = 0; j < (tamanho - i) / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Triangulo2(int tamanho) {
    for (int i = 1; i <= tamanho; i += 2) {
      for (int j = 0; j < (tamanho - i) / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = tamanho; i >= 1; i -= 2) {
      for (int j = 0; j < (tamanho - i) / 2; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
