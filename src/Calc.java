
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {


    public void logic() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число a");
            int a = scanner.nextInt();

            System.out.println("Введите число b");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите математический знак операции");
            String sig = scanner.nextLine();

            Arifmetic arifmetic = new Arifmetic();

            switch (sig) {


                case "+": {
                    int c = arifmetic.summa(a, b);
                    System.out.println("Результат " + c);
                    break;
                }


                case "-": {
                    int c = arifmetic.minus(a, b);
                    System.out.println("Результат " + c);
                    break;
                }

                case "*": {
                    int c = arifmetic.umnog(a, b);
                    System.out.println("Результат " + c);
                    break;
                }

                case "/": {
                    int c = arifmetic.delen(a, b);
                    System.out.println("Результат " + c);
                    break;
                }
                case "%": {
                    int c = arifmetic.ostacha(a, b);
                    System.out.println("Результат " + c);
                    break;
                }

                default:
                    System.out.println("Введите правильный математический знак операции ( + , - , * , /,%)");
                    logic();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Неправильно введен параметр");
            logic();
        }


    }
}
