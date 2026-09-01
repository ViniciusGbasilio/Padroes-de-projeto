import java.util.Scanner;

public class Cliente_202211250005 {
    public static void main(String[] args) {
        Calculadora_202211250005 calc = new Calculadora_202211250005();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Soma: " + calc.somar(a, b));
        System.out.println("Subtracao: " + calc.subtrair(a, b));
        System.out.println("Multiplicacao: " + calc.multiplicar(a, b));

        try {
            System.out.println("Divisao: " + calc.dividir(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}