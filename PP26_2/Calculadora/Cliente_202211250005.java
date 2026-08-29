public class Cliente_202211250005 {

    public static void main(String[] args) {
        Calculadora_202211250005 calc = new Calculadora_202211250005();

        double a = 10;
        double b = 0;

        double c = 50;
        double d = 2;

        System.out.println("Soma: " + calc.somar(a, b));
        System.out.println("Divisao: " + calc.dividir(c, d));
        
        /*System.out.println("Subtracao: " + calc.subtrair(a, b));
        System.out.println("Multiplicacao: " + calc.multiplicar(a, b));*/
        System.out.println("Divisao: " + calc.dividir(a, b));
    }
}