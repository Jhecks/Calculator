import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Calc calc = new Calc();
        try {
            System.out.println(calc.getResult(input));
        }
        catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}
