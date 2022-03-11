import java.util.*;

public class Calc {
    //sets of possible data inputs
    private final Set<String> numerals = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5", "6",
            "7", "8", "9", "10"));
    private final Set<String> operations = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

    private String[] inputArr;
    private String result = null;

    public Calc () {}

    /**
     *
     * @throws CalcException shouldn't be reachable, as it is checked before, but still
     */
    private void calculate() throws CalcException {
        switch (inputArr[1]) {
            case "+":
                result = Processor.process(inputArr[0], inputArr[2], OperationType.PLUS);
                break;
            case "-":
                result = Processor.process(inputArr[0], inputArr[2], OperationType.MINUS);
                break;
            case "*":
                result = Processor.process(inputArr[0], inputArr[2], OperationType.MULTIPLY);
                break;
            case "/":
                result = Processor.process(inputArr[0], inputArr[2], OperationType.DIVIDE);
                break;
            default:
                throw new CalcException("Wrong operation");
        }
    }

    /**
     * method to half verify input data. it is checking if arr is ["{numeral}", "{symbol}", "{numeral}"]
     * but there can be different types of numbers
     * @return true if array of strings was valid
     */
    private boolean verify() {
        return inputArr.length == 3
                && (numerals.contains(inputArr[0]) || RomanNumeral.contains(inputArr[0]))
                && operations.contains(inputArr[1])
                && (numerals.contains(inputArr[2]) || RomanNumeral.contains(inputArr[2]));
    }

    /**
     *
     * @param input string in format: "{numeral} {symbol} {numeral}", numeral can be either arabic or roman
     * @return result of calculating 2 numerals
     * @throws CalcException if string is invalid
     */
    public String getResult(String input) throws CalcException {
        this.inputArr = input.split(" ");
        if (!verify())
            throw new CalcException("Wrong string input");
        calculate();
        return result;
    }
}
