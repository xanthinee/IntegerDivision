package secondTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleOutputTest {

    ConsoleOutput testCo = new ConsoleOutput();

    @Test
    void consoleOutputBuild_whenDivisibleLessThanDivider() {
        ArrayList<DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(0,6,0,0));
        DivisionResult testDR = new DivisionResult(6, 7, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_6|7")
                .add(" 0|-")
                .add(" -|0")
                .add(" 6").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenFirstSubtrahendEqualToFirstMinuend() {
        List<DivisionStep> steps = Arrays.asList(new DivisionStep(1,9,9,1));
        DivisionResult testDR = new DivisionResult(98, 9, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_98|9")
                .add(" 9 |--")
                .add(" - |10")
                .add("  8").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_SubtrahendEqualToMinuendInTheMiddle() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(2,14,14,2));
        DivisionResult testDR = new DivisionResult(841, 7, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_841|7")
                .add(" 7  |---")
                .add(" -  |120")
                .add("_14")
                .add(" 14")
                .add(" --")
                .add("   1").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenLastSubtrahendEqualToLastMinuend() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(2,14,14,2));
        DivisionResult testDR = new DivisionResult(84, 7, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_84|7")
                .add(" 7 |--")
                .add(" - |12")
                .add("_14")
                .add(" 14")
                .add(" --")
                .add("  0").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerAreSingleNumber() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(1,8,6,1));
        DivisionResult testDR = new DivisionResult(8, 6, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_8|6")
                .add(" 6|-")
                .add(" -|1")
                .add(" 2").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsDecimalAndDividerIsSingleAndOneStep() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(9,46,45,2));
        DivisionResult testDR = new DivisionResult(46, 5, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_46|5")
                .add(" 45|--")
                .add(" --|9")
                .add("  1").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsDecimalAndDividerIsSingleAndTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,6,5,1),
                new DivisionStep(3,16,15,2));
        DivisionResult testDR = new DivisionResult(66, 5, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_66|5")
                .add(" 5 |--")
                .add(" - |13")
                .add("_16")
                .add(" 15")
                .add(" --")
                .add("  1").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerIsDecimal() {
        ArrayList <DivisionStep> steps = new ArrayList<>();
        steps.add(new DivisionStep(2,76,64,2));
        DivisionResult testDR = new DivisionResult(76, 32, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_76|32")
                .add(" 64|--")
                .add(" --|2")
                .add(" 12").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsSingleTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,10,7,2),
                new DivisionStep(4,31,28,3));
        DivisionResult testDR = new DivisionResult(101, 7, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_101|7")
                .add("  7 |---")
                .add(" -- |14")
                .add(" _31")
                .add("  28")
                .add("  --")
                .add("   3").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsSingleThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,8,7,1),
                new DivisionStep(1,10,7,2),
                new DivisionStep(4,31,28,3));
        DivisionResult testDR = new DivisionResult(801, 7, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_801|7")
                .add(" 7  |---")
                .add(" -  |114")
                .add("_10")
                .add("  7")
                .add(" --")
                .add(" _31")
                .add("  28")
                .add("  --")
                .add("   3").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsDecimalOneStep() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(6,131,114,3));
        DivisionResult testDR = new DivisionResult(131, 19, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_131|19")
                .add(" 114|---")
                .add(" ---|6")
                .add("  17").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsDecimalTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,13,11,2),
                new DivisionStep(1,21,11,3));
        DivisionResult testDR = new DivisionResult(131, 11, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_131|11")
                .add(" 11 |---")
                .add(" -- |11")
                .add(" _21")
                .add("  11")
                .add("  --")
                .add("  10").toString().toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerAreHundredth() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(3,781,669,3));
        DivisionResult testDR = new DivisionResult(781, 223, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_781|223")
                .add(" 669|---")
                .add(" ---|3")
                .add(" 112").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsSingleFourSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(3,9,9,1),
                new DivisionStep(2,8,6,2),
                new DivisionStep(9,27,27,3),
                new DivisionStep(2,6,6,4));
        DivisionResult testDR = new DivisionResult(9876, 3, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_9876|3")
                .add(" 9   |----")
                .add(" -   |3292")
                .add(" _8")
                .add("  6")
                .add("  -")
                .add(" _27")
                .add("  27")
                .add("  --")
                .add("   _6")
                .add("    6")
                .add("    -")
                .add("    0").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsSingleThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(9,28,27,2),
                new DivisionStep(5,17,15,3),
                new DivisionStep(8,26,24,4));
        DivisionResult testDR = new DivisionResult(2876, 3, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|3")
                .add(" 27  |----")
                .add(" --  |958")
                .add(" _17")
                .add("  15")
                .add("  --")
                .add("  _26")
                .add("   24")
                .add("   --")
                .add("    2").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsDecimalThreeSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,28,20,2),
                new DivisionStep(4,87,80,3),
                new DivisionStep(3,76,60,4));
        DivisionResult testDR = new DivisionResult(2876, 20, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|20")
                .add(" 20  |----")
                .add(" --  |143")
                .add(" _87")
                .add("  80")
                .add("  --")
                .add("  _76")
                .add("   60")
                .add("   --")
                .add("   16").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsDecimalTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(7,287,273,3),
                new DivisionStep(3,146,117,4));
        DivisionResult testDR = new DivisionResult(2876, 39, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|39")
                .add(" 273 |----")
                .add(" --- |73")
                .add(" _146")
                .add("  117")
                .add("  ---")
                .add("   29").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsHundredthTwoSteps() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,287,150,3),
                new DivisionStep(9,1376,1350,4));
        DivisionResult testDR = new DivisionResult(2876, 150, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|150")
                .add(" 150 |----")
                .add(" --- |19")
                .add("_1376")
                .add(" 1350")
                .add(" ----")
                .add("   26").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsMillionAndAbove() {
        List <DivisionStep> steps = Arrays.asList(new DivisionStep(1,10,10,2),
                new DivisionStep(4,40,40,6));
        DivisionResult testDR = new DivisionResult(1000400, 10, steps);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_1000400|10")
                .add(" 10     |-------")
                .add(" --     |100040")
                .add("    _40")
                .add("     40")
                .add("     --")
                .add("       0").toString();
        assertEquals(expected, testCo.consoleOutputBuild(testDR));
    }
}