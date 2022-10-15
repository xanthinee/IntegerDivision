package secondTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerDivisionTest {

    IntegerDivision test = new IntegerDivision();

    @Test
    void division_whenDivisibleIsLessThanDivider() {
        ArrayList<DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(0,0,0,0));
        DivisionResult testDR = new DivisionResult(0, 8, steps);
        assertEquals(testDR, test.division(0,8));
    }

    @Test
    void division_whenFirstSubtrahendEqualToFirstMinuend() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,9,9,1));
        DivisionResult testDR = new DivisionResult(98, 9, steps);
        assertEquals(testDR, test.division(98,9));
    }

    @Test
    void division_SubtrahendEqualToMinuendInTheMiddle() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(2,14,14,2));
        DivisionResult testDR = new DivisionResult(841, 7, steps);
        assertEquals(testDR, test.division(841,7));
    }

    @Test
    void division_whenLastSubtrahendEqualToLastMinuend() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(2,14,14,2));
        DivisionResult testDR = new DivisionResult(84, 7, steps);
        assertEquals(testDR, test.division(84,7));
    }

    @Test
    void division_whenDivisibleAndDividerAreSingleNumber() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(1,8,6,1));
        DivisionResult testDR = new DivisionResult(8, 6, steps);
        assertEquals(testDR, test.division(8,6));
    }

    @Test
    void division_whenDivisibleIsDecimalAndDividerIsSingleAndOneStep() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(9,46,45,2));
        DivisionResult testDR = new DivisionResult(46, 5, steps);
        assertEquals(testDR, test.division(46,5));
    }

    @Test
    void division_whenDivisibleIsDecimalAndDividerIsSingleAndTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,6,5,1),
                new DivisionStep(3,16,15,2));
        DivisionResult testDR = new DivisionResult(66, 5, steps);
        assertEquals(testDR, test.division(66,5));
    }

    @Test
    void division_whenDivisibleAndDividerIsDecimal() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(2,76,64,2));
        DivisionResult testDR = new DivisionResult(76, 32, steps);
        assertEquals(testDR, test.division(76,32));
    }

    @Test
    void division_whenDivisibleIsHundredthDividerIsSingleTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,10,7,2),
                new DivisionStep(4,31,28,3));
        DivisionResult testDR = new DivisionResult(101, 7, steps);
        assertEquals(testDR, test.division(101,7));
    }

    @Test
    void division_whenDivisibleIsHundredthDividerIsSingleThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(1,10,7,2),
                new DivisionStep(4,31,28,3));
        DivisionResult testDR = new DivisionResult(801, 7, steps);
        assertEquals(testDR, test.division(801,7));
    }

    @Test
    void division_whenDivisibleIsHundredthDividerIsDecimalOneStep() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(6,131,114,3));
        DivisionResult testDR = new DivisionResult(131, 19, steps);
        assertEquals(testDR, test.division(131,19));
    }

    @Test
    void division_whenDivisibleIsHundredthDividerIsDecimalTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,13,11,2),
                new DivisionStep(1,21,11,3));
        DivisionResult testDR = new DivisionResult(131, 11, steps);
        assertEquals(testDR, test.division(131,11));
    }

    @Test
    void division_whenDivisibleAndDividerAreHundredth() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(3,781,669,3));
        DivisionResult testDR = new DivisionResult(781, 223, steps);
        assertEquals(testDR, test.division(781,223));
    }

    @Test
    void division_whenDivisibleIsThousandthDividerIsSingleFourSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(3,9,9,1),
                new DivisionStep(2,8,6,2),
                new DivisionStep(9,27,27,3),
                new DivisionStep(2,6,6,4));
        DivisionResult testDR = new DivisionResult(9876, 3, steps);
        assertEquals(testDR, test.division(9876,3));
    }

    @Test
    void division_whenDivisibleIsThousandthDividerIsSingleThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(9,28,27,2),
                new DivisionStep(5,17,15,3),
                new DivisionStep(8,26,24,4));
        DivisionResult testDR = new DivisionResult(2876, 3, steps);
        assertEquals(testDR, test.division(2876,3));
    }

    @Test
    void division_whenDivisibleIsThousandthDividerIsDecimalThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,28,20,2),
                new DivisionStep(4,87,80,3),
                new DivisionStep(3,76,60,4));
        DivisionResult testDR = new DivisionResult(2876, 20, steps);
        assertEquals(testDR, test.division(2876,20));
    }

    @Test
    void division_whenDivisibleIsThousandthDividerIsDecimalTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(7,287,273,3),
                new DivisionStep(3,146,117,4));
        DivisionResult testDR = new DivisionResult(2876, 39, steps);
        assertEquals(testDR, test.division(2876,39));
    }

    @Test
    void division_whenDivisibleIsThousandthDividerIsHundredthTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,287,150,3),
                new DivisionStep(9,1376,1350,4));
        DivisionResult testDR = new DivisionResult(2876, 150, steps);
        assertEquals(testDR, test.division(2876,150));
    }

    @Test
    void division_whenDivisibleIsMillionAndAbove() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,10,10,2),
                new DivisionStep(4,40,40,6));
        DivisionResult testDR = new DivisionResult(1000400, 10, steps);
        assertEquals(testDR, test.division(1000400,10));
    }
}