import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        String operacion;
        System.out.println("Indique la operacion (+,-,x,^,/,sqrt)");

        operacion = scanner.nextLine();
        double result = 0;

        if (operacion.equals("sqrt")){
            int num;
            System.out.println("Digite un numero");
            num = Integer.parseInt(scanner.nextLine());
            result = calculator.sqrt(num);
        }
        else{
            int num1;
            int num2;
            System.out.println("Digite primer numero");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite segundo numero");
            num2 = Integer.parseInt(scanner.nextLine());

            if(operacion.equals("+")){
                result = calculator.addition(num1,num2);

            }else if(operacion.equals("-")){
                result = calculator.subtraction(num1,num2);

            }else if(operacion.equals("x")){
                result = calculator.multiplication(num1,num2);

            } else if(operacion.equals("^")){
                result = calculator.power(num1,num2);

            }else if(operacion.equals("/")) {
                result = calculator.division(num1, num2);

            } else {
                System.out.println("Invalid operation");
            }
        }

        System.out.println(result);
    }
}
