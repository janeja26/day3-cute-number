package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {

        boolean valid = isValid(start, end);
        if (valid) {
            return generateTable(start, end);
        }

        return null;
    }

    private Boolean isValid(int start, int end) {

        return null;
    }

    private Boolean isInRange(int number) {

        return number >= 1 && number <= 1000;
    }

    private Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start<=end;
    }

    private String generateTable(int start, int end) {

        return null;
    }

    private String generateLine(int start, int row) {
        return null;
    }

    private String generateExpression(int multiplicand, int multiplier) {

        return multiplicand+"*"+multiplier+"*"+"=" + multiplicand*multiplier;
    }
}
