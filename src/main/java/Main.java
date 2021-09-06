import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        String operacion;
        System.out.println("Indique la operacion (+,-,x,^,/,sqrt)");

        operacion = scanner.nextLine();
        if (operacion == "sqrt"){
            int num;
            System.out.println("Digite un numero");
            num = Integer.parseInt(scanner.nextLine());
            calculator.sqrt(num);

        }
        else{
            int num1;
            int num2;
            System.out.println("Digite primer numero");
            num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite segundo numero");
            num2 = Integer.parseInt(scanner.nextLine());

            if(operacion == "+"){
                calculator.addition(num1,num2);

            }else if(operacion == "-"){
                calculator.subtraction(num1,num2);

            }else if(operacion == "x"){
                calculator.multiplication(num1,num2);

            } else if(operacion == "^"){
                calculator.power(num1,num2);

            }else if(operacion == "/") {
                calculator.division(num1, num2);

            }
        }



    }
}
