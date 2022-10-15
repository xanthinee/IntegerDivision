package secondTask;

import java.util.StringJoiner;

public class ConsoleOutput {

    public String consoleOutputBuild(DivisionResult dr) {

        DivisionStep drStepNum = dr.getDivisionSteps().get(0);
        int dSize = Utils.lineSize(dr.getDivisible());
        int tempDivisibleSize = Utils.lineSize(drStepNum.getSubtrahend());
        int tempDividerSize = Utils.lineSize(drStepNum.getMinuend());

        StringBuilder columnBody = new StringBuilder()
                .append("_").append(dr.getDivisible()).append("|").append(dr.getDivider())
                .append(System.lineSeparator())
                .append(Utils.repeat(" ", 1 + (tempDivisibleSize - tempDividerSize))).append(drStepNum.getMinuend())
                .append(Utils.repeat(" ", dSize - tempDivisibleSize)).append("|").append(Utils.repeat("-", dSize))
                .append(System.lineSeparator())
                .append(" ").append(Utils.repeat("-", tempDivisibleSize)).append(Utils.repeat(" ", dSize - tempDivisibleSize))
                .append("|").append(dr.getQuotient())
                .append(System.lineSeparator());

        int numOfIterations = dr.getDivisionSteps().size();
        for (int i = 1; i < numOfIterations; i++) {

            drStepNum = dr.getDivisionSteps().get(i);
            tempDivisibleSize = Utils.lineSize(drStepNum.getSubtrahend());
            tempDividerSize = Utils.lineSize(drStepNum.getMinuend());
            int indentionSize = drStepNum.getIndention() + 1 - Utils.lineSize(drStepNum.getSubtrahend());
            columnBody.append(Utils.repeat(" ", indentionSize - 1)).append("_").append(drStepNum.getSubtrahend())
                    .append(System.lineSeparator())
                    .append(Utils.repeat(" ", indentionSize + (tempDivisibleSize - tempDividerSize))).append(drStepNum.getMinuend())
                    .append(System.lineSeparator())
                    .append(Utils.repeat(" ", indentionSize)).append(Utils.repeat("-", tempDivisibleSize))
                    .append(System.lineSeparator());
        }
        int remainderSize = Utils.lineSize(dr.getRemainder());
        columnBody.append(Utils.repeat(" ", (dSize - remainderSize) + 1) + dr.getRemainder());
        return columnBody.toString();
    }
}
