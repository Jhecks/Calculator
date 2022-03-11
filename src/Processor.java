public class Processor {

    public static String process (String firstInput, String lastInput, OperationType operationType) throws CalcException {
        int first = -1;
        int last = -1;
        String result = null;

        try {
            first = Integer.parseInt(firstInput);
            last = Integer.parseInt(lastInput);
            int resultInt = operationType.apply(first, last);
            result = String.valueOf(resultInt);
            return result;
        }
        catch (Exception e) {
            if (e instanceof CalcException)
                throw e;

            if (first != -1)
                throw new CalcException("Different types of numerals");

            RomanNumeral firstNumber = RomanNumeral.findNumeral(firstInput);
            RomanNumeral lastNumber = RomanNumeral.findNumeral(lastInput);

            if (firstNumber == null
                    || lastNumber == null)
                throw new CalcException("Wrong roman numeral");

            first = firstNumber.getArabicNumber();
            last = lastNumber.getArabicNumber();
            int resultInt = operationType.apply(first, last);
            if (resultInt >= 1)
                result = String.valueOf(RomanNumeral.findRomanNumeral(resultInt));
            if (result == null)
                throw new CalcException("Result less then 1 in Roman calculation");
            return result;
        }
    }
}
