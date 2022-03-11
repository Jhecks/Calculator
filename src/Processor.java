public class Processor {

    public static String process (String firstInput, String lastInput, OperationType operationType) throws CalcException {
        int first = -1;
        int last = -1;
        String result = null;

        //try due to Integer.parseInt throws exception if number is unparsable in this case, roman numerals
        try {
            first = Integer.parseInt(firstInput);
            last = Integer.parseInt(lastInput);
            int resultInt = operationType.apply(first, last);
            result = String.valueOf(resultInt);
            return result;
        }
        catch (Exception e) {
            //unreachable exception, if there is dividing by zero
            if (e instanceof CalcException)
                throw e;
            //this exception reaches if first numeral is arabic and second is roman
            if (first != -1)
                throw new CalcException("Different types of numerals");

            RomanNumeral firstNumber = RomanNumeral.findNumeral(firstInput);
            RomanNumeral lastNumber = RomanNumeral.findNumeral(lastInput);
            //thrown if any of 2 roman numerals wasn't found, in normal situation only the lastNumber can be null
            if (firstNumber == null || lastNumber == null)
                throw new CalcException("Different types of numerals");

            first = firstNumber.getArabicNumber();
            last = lastNumber.getArabicNumber();
            //using method in operation enum type
            int resultInt = operationType.apply(first, last);
            //checking if result not less than 1, because roman numerals starts from 1
            if (resultInt >= 1)
                result = String.valueOf(RomanNumeral.findRomanNumeral(resultInt));
            //shouldn't be reachable, but exception thrown,
            // if there is no suitable roman numeral from the RomanNumeral enum class
            if (result == null)
                throw new CalcException("Result less then 1 in Roman calculation");
            return result;
        }
    }
}
