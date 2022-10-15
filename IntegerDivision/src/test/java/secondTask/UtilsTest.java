package secondTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void getDigits_whenDivisibleIsLowerThan10() {
        int[] testArray = {6};
        assertArrayEquals(testArray, Utils.getDigits(6));
    }

    @Test
    void getDigits_whenDivisibleIs10To99() {
        int[] testArray = {6,7};
        assertArrayEquals(testArray, Utils.getDigits(67));
    }

    @Test
    void getDigits_whenDivisibleIs100To999() {
        int[] testArray = {6,7,5};
        assertArrayEquals(testArray, Utils.getDigits(675));
    }

    @Test
    void getDigits_whenDivisibleIs1000To99999() {
        int[] testArray = {6,7,5,8};
        assertArrayEquals(testArray, Utils.getDigits(6758));
    }

    @Test
    void getDigits_whenDivisibleIs100000To999999() {
        int[] testArray = {6,7,5,8,9};
        assertArrayEquals(testArray, Utils.getDigits(67589));
    }

    @Test
    void getDigits_whenDivisibleIs1000000AndMore() {
        int[] testArray = {6,7,5,8,9,0,1};
        assertArrayEquals(testArray, Utils.getDigits(6758901));
    }

    @Test
    void lineSize_whenNumberIsSingle() {
        int testNum = 7;
        assertEquals(1, Utils.lineSize(testNum));
    }

    @Test
    void lineSize_whenNumberIsDecimal() {
        int testNum = 12;
        assertEquals(2, Utils.lineSize(testNum));
    }

    @Test
    void lineSize_whenNumberIsHundredth() {
        int testNum = 121;
        assertEquals(3, Utils.lineSize(testNum));
    }

    @Test
    void lineSize_whenNumberIsThousandth() {
        int testNum = 1212;
        assertEquals(4, Utils.lineSize(testNum));
    }

    @Test
    void repeat_whenDifferentSymbols() {
        String spaces = "   ";
        String hyphens = "---";
        String underscores = "___";
        String otherSymbol = "###";
        assertEquals(spaces, Utils.repeat(" ",3));
        assertEquals(hyphens, Utils.repeat("-", 3));
        assertEquals(underscores, Utils.repeat("_", 3));
        assertEquals(otherSymbol, Utils.repeat("#", 3));
    }
}