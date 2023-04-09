// Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
// Para homens: (72.7*h) - 58
// Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Olá, informe sua altura que vamos calcular o seu peso ideal: ");
    Scanner tecladoAltura = new Scanner(System.in);
    double altura = tecladoAltura.nextFloat();

    System.out.println("Olá agora informe seu gênero Masculino ou Feminino?");
    Scanner tecladoEscolha = new Scanner(System.in);
    String escolha = tecladoEscolha.nextLine();

    switch (escolha) {
      case "Masculino":
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("O seu peso ideial com base na altura é:" + pesoIdeal);
        break;
      case "Feminino":
        double pesoIdealFeminino = (62.1 * altura) - 44.7;
        System.out.println("O seu peso ideial com base na altura é:" + pesoIdealFeminino);
        break;
      default:
        System.out.println("Olá, escolha uma das opções Masculino ou feminino");

    }
  }
}