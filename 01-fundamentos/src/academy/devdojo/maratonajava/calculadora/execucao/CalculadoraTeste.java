package academy.devdojo.maratonajava.calculadora.execucao;

import academy.devdojo.maratonajava.calculadora.dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTeste {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("====MENU==== \n 1-calcular \n 2-Sair");
        int opcao = scanner.nextInt();
        while (opcao != 2) {
            System.out.println("Digite o primeiro numero:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero:");
            double num2 = scanner.nextDouble();

            System.out.println("Digite a operação a ser feita (+, -, *, /):");
            char operacao = scanner.next().charAt(0);

            double resultado = calculadora.calculo(num1, num2, operacao);

            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }
}
