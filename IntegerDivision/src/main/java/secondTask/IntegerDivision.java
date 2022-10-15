package secondTask;

import java.util.ArrayList;

@SuppressWarnings("java:S106")
public class IntegerDivision {

    public DivisionResult division(int divisible, int divider) {

        ArrayList<DivisionStep> steps = new ArrayList<>();

        if (divisible < divider) {
            steps.add(new DivisionStep(0, divisible, 0, 0));
            return new DivisionResult(divisible, divider, steps);
        }

        int tempDivider;
        int tempSubtrahend = 0;
        int tempMinuend;
        int tempRemainder;
        int indention = 0;

        int[] divisibleArr = Utils.getDigits(divisible);
        for (int i = 0; i < divisibleArr.length; i++) {
            tempSubtrahend = tempSubtrahend * 10 + divisibleArr[i];
            indention++;
             if (tempSubtrahend >= divider) {
                tempDivider = tempSubtrahend / divider;
                tempMinuend = tempDivider * divider;
                tempRemainder = tempSubtrahend - tempMinuend;
                steps.add(new DivisionStep(tempDivider, tempSubtrahend, tempMinuend, indention));
                tempSubtrahend = tempRemainder;
            }
        }
        System.out.println(new DivisionResult(divisible, divider, steps));
        return new DivisionResult(divisible, divider, steps);
    }
}
