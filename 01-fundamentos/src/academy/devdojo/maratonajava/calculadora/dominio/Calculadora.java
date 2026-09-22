package academy.devdojo.maratonajava.calculadora.dominio;

public class Calculadora {

    public double calculo (double num1, double num2, char operacao){
        double resultado = 0;
        switch (operacao){
            case '+' :
                resultado = num1 + num2; break;
            case '-' :
                resultado = num1 - num2; break;
            case '*' :
                resultado = num1 * num2; break;
            case '/' :
                resultado = num1 / num2; break;
            default:
                System.out.println("Operação inválida!");
        }

        return resultado;
    }
}
