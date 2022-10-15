package secondTask;

import java.util.Objects;

public class DivisionStep {

    private int divider;
    private int subtrahend;
    private int minuend;
    private int indention;

    public DivisionStep(int divider, int subtrahend, int minuend, int indention) {

        this.divider = divider;
        this.subtrahend = subtrahend;
        this.minuend = minuend;
        this.indention = indention;
    }

    public int getDivider() {
        return divider;
    }

    public void setDivider(int divider) {
        this.divider = divider;
    }

    public int getSubtrahend() {
        return subtrahend;
    }

    public void setSubtrahend(int subtrahend) {
        this.subtrahend = subtrahend;
    }

    public int getMinuend() {
        return minuend;
    }

    public void setMinuend(int minuend) {
        this.minuend = minuend;
    }

    public int getIndention() {
        return indention;
    }

    public void setIndention(int indention) {
        this.indention = indention;
    }

    @Override
    public String toString() {
        return "DivisionStep{" +
                "divider=" + divider +
                ", subtrahend=" + subtrahend +
                ", minuend=" + minuend +
                ", indention=" + indention +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivisionStep that = (DivisionStep) o;
        return divider == that.divider && subtrahend == that.subtrahend && minuend == that.minuend && indention == that.indention;
    }

    @Override
    public int hashCode() {
        return Objects.hash(divider, subtrahend, minuend, indention);
    }
}
