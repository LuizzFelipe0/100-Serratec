package calc;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Insira o primeiro número: ");
        double n1 = leitor.nextDouble();
        
        System.out.print("Insira o segundo número: ");
        double n2 = leitor.nextDouble();
        
        System.out.print(
                "1 - Somar\n"
                + "2 - Subtrair\n"
                + "3 - Multiplicar\n"
                + "4 - Dividir\n"
                + "5 - Resto\n"
                + "0 - Sair\n"
                + "Insira a operação: "
            );
        int operacao = leitor.nextInt();
        
        c1.calcular(n1, n2, operacao);
        leitor.close();
    }

}