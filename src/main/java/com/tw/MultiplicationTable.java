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

        return isInRange(start)&&isInRange(end)&&isStartNotBiggerThanEnd(start, end);
    }

    private Boolean isInRange(int number) {

        return number >= 1 && number <= 1000;
    }

    private Boolean isStartNotBiggerThanEnd(int start, int end) {

        return start <= end;
    }

    private String generateTable(int start, int end) {

        StringBuilder table = new StringBuilder();
        for (int row = start; row <= end; row++) {
            table.append(generateLine(start, row)).append("\n");
        }
        return table.toString();

    }

    private String generateLine(int start, int row) {

        StringBuilder line = new StringBuilder();
        for (int col = start; col <= row; col++) {
            line.append(generateExpression(col, row)).append("  ");
        }
        return line.toString();

    }

    private String generateExpression(int multiplicand, int multiplier) {

        return multiplicand + "*" + multiplier + "*" + "=" + multiplicand * multiplier;
    }
}
