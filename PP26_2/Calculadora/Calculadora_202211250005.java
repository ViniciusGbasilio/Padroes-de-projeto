public class Calculadora_202211250005 {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
    if (b == 0) 
        {throw new IllegalArgumentException("O divisor nao pode ser zero.");}
    return a / b;
    }
}