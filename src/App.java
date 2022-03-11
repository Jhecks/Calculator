import java.util.Scanner;

public class App {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            Calc calc = new Calc(input);
            System.out.println(calc.getResult());
        }
        catch (CalcException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getString());
        }
    }

}
