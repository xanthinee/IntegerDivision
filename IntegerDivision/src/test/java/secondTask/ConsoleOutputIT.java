package secondTask;

import org.junit.jupiter.api.Test;

import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleOutputIT {

    IntegerDivision id = new IntegerDivision();
    ConsoleOutput co = new ConsoleOutput();

    @Test
    void consoleOutputBuild_whenDivisibleLessThanDivider() {
        DivisionResult testDR = id.division(6,7);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_6|7")
                .add(" 0|-")
                .add(" -|0")
                .add(" 6").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenFirstSubtrahendEqualToFirstMinuend() {
        DivisionResult testDR = id.division(98,9);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_98|9")
                .add(" 9 |--")
                .add(" - |10")
                .add("  8").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_SubtrahendEqualToMinuendInTheMiddle() {
        DivisionResult testDR = id.division(841,7);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_841|7")
                .add(" 7  |---")
                .add(" -  |120")
                .add("_14")
                .add(" 14")
                .add(" --")
                .add("   1").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenLastSubtrahendEqualToLastMinuend() {
        DivisionResult testDR = id.division(84,7);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_84|7")
                .add(" 7 |--")
                .add(" - |12")
                .add("_14")
                .add(" 14")
                .add(" --")
                .add("  0").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerAreSingleNumber() {
        DivisionResult testDR = id.division(8,6);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_8|6")
                .add(" 6|-")
                .add(" -|1")
                .add(" 2").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsDecimalAndDividerIsSingleAndOneStep() {
        DivisionResult testDR = id.division(46,5);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_46|5")
                .add(" 45|--")
                .add(" --|9")
                .add("  1").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsDecimalAndDividerIsSingleAndTwoSteps() {
        DivisionResult testDR = id.division(66,5);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_66|5")
                .add(" 5 |--")
                .add(" - |13")
                .add("_16")
                .add(" 15")
                .add(" --")
                .add("  1").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerIsDecimal() {
        DivisionResult testDR = id.division(76,32);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_76|32")
                .add(" 64|--")
                .add(" --|2")
                .add(" 12").toString();
        assertEquals(expected, co
                .consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsSingleTwoSteps() {
        DivisionResult testDR = id.division(101,7);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_101|7")
                .add("  7 |---")
                .add(" -- |14")
                .add(" _31")
                .add("  28")
                .add("  --")
                .add("   3").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsSingleThreeSteps() {
        DivisionResult testDR = id.division(801,7);
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
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsDecimalOneStep() {
        DivisionResult testDR = id.division(131,19);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_131|19")
                .add(" 114|---")
                .add(" ---|6")
                .add("  17").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsHundredthDividerIsDecimalTwoSteps() {
        DivisionResult testDR = id.division(131,11);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_131|11")
                .add(" 11 |---")
                .add(" -- |11")
                .add(" _21")
                .add("  11")
                .add("  --")
                .add("  10").toString().toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleAndDividerAreHundredth() {
        DivisionResult testDR = id.division(781,223);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_781|223")
                .add(" 669|---")
                .add(" ---|3")
                .add(" 112").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsSingleFourSteps() {
        DivisionResult testDR = id.division(9876,3);
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
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsSingleThreeSteps() {
        DivisionResult testDR = id.division(2876,3);
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
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsDecimalThreeSteps() {
        DivisionResult testDR = id.division(2876,20);
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
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsDecimalTwoSteps() {
        DivisionResult testDR = id.division(2876,39);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|39")
                .add(" 273 |----")
                .add(" --- |73")
                .add(" _146")
                .add("  117")
                .add("  ---")
                .add("   29").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsThousandthDividerIsHundredthTwoSteps() {
        DivisionResult testDR = id.division(2876,150);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_2876|150")
                .add(" 150 |----")
                .add(" --- |19")
                .add("_1376")
                .add(" 1350")
                .add(" ----")
                .add("   26").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }

    @Test
    void consoleOutputBuild_whenDivisibleIsMillionAndAbove() {
        DivisionResult testDR = id.division(1000400,10);
        String expected = new StringJoiner(System.lineSeparator())
                .add("_1000400|10")
                .add(" 10     |-------")
                .add(" --     |100040")
                .add("    _40")
                .add("     40")
                .add("     --")
                .add("       0").toString();
        assertEquals(expected, co.consoleOutputBuild(testDR));
    }
}
