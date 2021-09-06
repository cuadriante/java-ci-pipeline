//Obtenido de https://www.lawebdelprogramador.com/codigo/Java/4241-Calculadora-Basica.html


public class BasicCalculator{
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtraction(int a, int b){
        int result = a - b;;
        return result;
    }

    public int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public double division(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Math Error: Cannot divide by zero");
        } else {
            double result = a / b;
            return result;
        }
    }

    public int power(int a, int b){
        if (a==0 && b==0) {
            throw new IllegalArgumentException("Math Error: Undefined");
        } else {
            int result = (int)Math.pow(a, b);
            return result;
        }
    }


    public double sqrt(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Math Error: Undefined");
        } else {
            double result = Math.sqrt(a);
            return result;
        }
    }
}