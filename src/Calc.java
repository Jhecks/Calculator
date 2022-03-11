import java.util.*;

public class Calc {
    //sets of possible data inputs
    private final Set<String> numerals = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5", "6",
            "7", "8", "9", "10"));
    private final Set<String> operations = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

    private String[] inputArr;
    private String result = null;

    public Calc (String input) throws CalcException {
        this.inputArr = input.split(" ");
        if (!verify())
            throw new CalcException("Wrong string input", input);
    }

    //main method to calculate result
    public void calculate() throws CalcException {
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
                throw new CalcException("Wrong operation", inputArr[1]);
        }
    }


    //method to half verify input data. it is checking if arr is [number, operation, number]
    //but there can be different types of numbers
    private boolean verify() {

        return inputArr.length == 3
                && (numerals.contains(inputArr[0]) || RomanNumeral.contains(inputArr[0]))
                && operations.contains(inputArr[1])
                && (numerals.contains(inputArr[2]) || RomanNumeral.contains(inputArr[2]));
    }

    public String getResult() throws CalcException {
        calculate();
        return result;
    }
}

class CalcException extends Exception{

    private String str;
    public CalcException(String message, String str){
        super(message);
        this.str = str;
    }

    public String getString() {
        return str;
    }
}
