package secondTask;

import java.util.List;
import java.util.Objects;

public class DivisionResult {

    private int divisible;
    private int divider;
    private int quotient;
    private int remainder;
    private List<DivisionStep> divisionSteps;

    public DivisionResult(int divisible, int divider, List<DivisionStep> divisionSteps) {

        this.divisible = divisible;
        this.divider = divider;
        this.divisionSteps = divisionSteps;
        this.quotient = divisible / divider;
        this.remainder = divisible % divider;
    }

    @Override
    public String toString() {
        return "DivisionResult{" +
                "divisible=" + divisible +
                ", divider=" + divider +
                ", quotient= " + quotient +
                ", remainder= " + remainder +
                ", divisionStep=" + divisionSteps +
                '}';
    }

    public int getDivisible() {
        return divisible;
    }
    public void setDivisible(int divisible) {
        this.divisible = divisible;
    }

    public int getDivider() {
        return divider;
    }
    public void setDivider(int divider) {
        this.divider = divider;
    }

    public int getQuotient() {
        return quotient;
    }
    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }

    public int getRemainder() {
        return remainder;
    }
    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public List<DivisionStep> getDivisionSteps() {
        return divisionSteps;
    }
    public void setDivisionSteps(List<DivisionStep> divisionSteps) {
        this.divisionSteps = divisionSteps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivisionResult that = (DivisionResult) o;
        return divisible == that.divisible && divider == that.divider && quotient == that.quotient && remainder == that.remainder && divisionSteps.equals(that.divisionSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(divisible, divider, quotient, remainder, divisionSteps);
    }
}
