import java.util.Scanner;

public class Questao2 {

  public static void main(String[] args) {
    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o valor da temperatura: ");
    double valorTemperatura = scanner.nextDouble();
    String unidadeEntrada = new String();
    String unidadeSaida = new String();
    // roda até ser digitado um valor valido
    while (true) {
      System.out.printf(
        "Informe a unidade dessa temperatura %n (use: C para grau Celsius, K para Kelvin ou F para grau Fahrenheit)%n: "
      );
      unidadeEntrada = scanner.next();
      if (
        unidadeEntrada.equals("C") ||
        unidadeEntrada.equals("K") ||
        unidadeEntrada.equals("F")
      ) {
        break;
      } else {
        System.out.println(
          "!!!Entrada especificada não é válida, digite novamente:!!"
        );
        continue;
      }
    }
    // roda até ser digitado um valor valido
    while (true) {
      System.out.printf(
        "Para qual unidade deseja converter %n (use: C para grau Celsius, K para Kelvin ou F para grau Fahrenheit)%n: "
      );
      unidadeSaida = scanner.next();
      if (
        unidadeSaida.equals("C") ||
        unidadeSaida.equals("K") ||
        unidadeSaida.equals("F")
      ) {
        break;
      } else {
        System.out.println(
          "!!!Entrada especificada não é válida, digite novamente:!!"
        );
        continue;
      }
    }

    // Convertedor
    double temperaturaConvertida = convertedor(
      valorTemperatura,
      unidadeEntrada,
      unidadeSaida
    );

    // Resultado
    System.out.printf(
      valorTemperatura +
      unidadeEntrada +
      " = " +
      temperaturaConvertida +
      unidadeSaida
    );
    scanner.close();
  }

  public static double convertedor(
    double valorTemp,
    String uEntrada,
    String uSaida
  ) {
    double resultado = 0.0;

    if (uEntrada.equals("C")) {
      if (uSaida.equals("K")) {
        resultado = valorTemp + 273.15;
      } else if (uSaida.equals("F")) {
        resultado = (valorTemp * 9 / 5) + 32;
      } else {
        resultado = valorTemp; // Se a unidade de entrada for a mesma da de saida
      }
    } else if (uEntrada.equals("K")) {
      if (uSaida.equals("C")) {
        resultado = valorTemp - 273.15;
      } else if (uSaida.equals("F")) {
        resultado = (valorTemp - 273.15) * 9 / 5 + 32;
      } else {
        resultado = valorTemp;
      }
    } else if (uEntrada.equals("F")) {
      if (uSaida.equals("C")) {
        resultado = (valorTemp - 32) * 5 / 9;
      } else if (uSaida.equals("K")) {
        resultado = (valorTemp - 32) * 5 / 9 + 273.15;
      } else {
        resultado = valorTemp;
      }
    }

    return resultado;
  }
}
