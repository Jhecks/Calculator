import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            Calc calc = new Calc(input);
            System.out.println(calc.getResult());
        }
        catch (CalcException e) {
            System.out.println(e.getMessage());
        }
    }
}
