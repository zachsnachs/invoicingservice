package c322.homework.homework3.parta;

import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        char op;
        double num1, num2, modNum;
        Scanner input = new Scanner(System.in);
        System.out.println("To add, press + : To subtract, press - : To multiply, press *, To divide" +
                " " + "press /: To addMod, press #:, To subMod: press !:  ");
        op = input.next().charAt(0);
        System.out.println("Okay, now enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Now enter the second number: ");
        num2 = input.nextDouble();

        switch (op) {
            case'+':

                CalcContext context = new CalcContext(new Adder());
                System.out.println("Resulting sum: ");
                System.out.println(context.doCalc(num1, num2));
                break;

            case '-':

                CalcContext contextSub = new CalcContext(new Sub());
                System.out.println("Resulting difference: ");
                System.out.println(contextSub.doCalc(num1, num2));
                break;

            case '*':

                CalcContext contextMult = new CalcContext(new Multi());
                System.out.println("Resulting product: ");
                System.out.println(contextMult.doCalc(num1, num2));
                break;

            case '/':

                CalcContext contextDiv = new CalcContext(new Divid());
                System.out.println("Resulting quotient: ");
                System.out.println(contextDiv.doCalc(num1, num2));
                break;

            case'#':

                ModContext contextMod = new ModContext((new addMod()));
                System.out.println("Enter the modulo number: ");
                modNum = input.nextDouble();
                System.out.println(contextMod.doMod(num1, num2, modNum));
                break;

            case'!':

                ModContext contextModSub = new ModContext((new subMod()));
                System.out.println("Enter the modulo number: ");
                modNum = input.nextDouble();
                System.out.println(contextModSub.doMod(num1, num2, modNum));
                break;


            default:
                System.out.println("Error: Incorrect input . . .  ");
                break;



        }
    }
}
