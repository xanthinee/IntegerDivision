
package secondTask;

@SuppressWarnings("java:S106")
public class Main {

    public static void main(String[] args) {

        IntegerDivision intDiv = new IntegerDivision();
        ConsoleOutput co = new ConsoleOutput();
        DivisionResult divRes = intDiv.division(801,7);
        System.out.println(co.consoleOutputBuild(divRes));
    }
}
