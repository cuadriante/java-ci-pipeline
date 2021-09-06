//Obtenido de https://www.lawebdelprogramador.com/codigo/Java/4241-Calculadora-Basica.html


public class BasicCalculator{
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtraction(int a, int b){
        int result = a - b;
        return result;
    }

    public int multiplication(int a, int b){
        int result = a * b;
        return result;
    }

    public int division(int a, int b){
        int result = a / b;
        return result;
    }

    public int power(int a, int b){
        int result = (int)Math.pow(a, b);
        return result;
    }

    public int remainder(int a, int b){
        int result = a % b;
        return result;
    }

    public int sqrt(int a) {
        int result = (int)Math.sqrt(a);
        return result;
    }
}