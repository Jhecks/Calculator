import org.junit.*;
import static org.junit.Assert.*;

public class CalcTester {

    @Test
    public void testCalculatorExceptions() {
        String input = "10 + 0";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "10 + 1 + 5";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "V - V";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "V - VI";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "V + V - V";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "V + V - V";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }
        input = "V + 1";
        try {
            Calc calc = new Calc();
            System.out.println(calc.getResult(input));
            fail();
        }
        catch (CalcException e) {
            //nothing to do
        }

    }

    @Test
    public void testArabicCalc() {
        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = i + " " + "+" + " " + j;
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(i + j), calc.getResult(input));
                    System.out.println(i + " + " + j + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = i + " " + "*" + " = " + j;
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(i * j), calc.getResult(input));
                    System.out.println(i + " * " + j + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = i + " " + "-" + " " + j;
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(i - j), calc.getResult(input));
                    System.out.println(i + " - " + j + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = i + " " + "/" + " " + j;
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(i / j), calc.getResult(input));
                    System.out.println(i + " / " + j + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }
    }

    @Test
    public void testRomanCalc () {
        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = RomanNumeral.findRomanNumeral(i) + " " + "+" + " " + RomanNumeral.findRomanNumeral(j);
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(RomanNumeral.findRomanNumeral(i + j)), calc.getResult(input));
                    System.out.println(RomanNumeral.findRomanNumeral(i) + " + " + RomanNumeral.findRomanNumeral(j) + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = RomanNumeral.findRomanNumeral(i) + " " + "-" + " " + RomanNumeral.findRomanNumeral(j);
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(RomanNumeral.findRomanNumeral(i - j)), calc.getResult(input));
                    System.out.println(RomanNumeral.findRomanNumeral(i) + " - " + RomanNumeral.findRomanNumeral(j) + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = RomanNumeral.findRomanNumeral(i) + " " + "*" + " " + RomanNumeral.findRomanNumeral(j);
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(RomanNumeral.findRomanNumeral(i * j)), calc.getResult(input));
                    System.out.println(RomanNumeral.findRomanNumeral(i) + " * " + RomanNumeral.findRomanNumeral(j) + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }

        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) {
                String input = RomanNumeral.findRomanNumeral(i) + " " + "/" + " " + RomanNumeral.findRomanNumeral(j);
                try {
                    Calc calc = new Calc();
                    assertEquals(String.valueOf(RomanNumeral.findRomanNumeral(i / j)), calc.getResult(input));
                    System.out.println(RomanNumeral.findRomanNumeral(i) + " / " + RomanNumeral.findRomanNumeral(j) + " = " + calc.getResult(input));
                }
                catch (Exception e) {
                    //
                }
            }
    }
}
