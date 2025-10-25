package khai.dict.java._07_classes_interaction;

public class StepsCounter {
    private long steps = 0;

    public long getSteps() {
        return steps;
    }

    public void inc() {
        steps++;
    }

    public void inc(long extra) {
        steps += extra;
    }

    public void inc(int extra) {
        steps += extra;
    }

    public void flush() {
        steps = 0;
    }

    @Override
    public String toString() {
        return "StepsCounter{" +
                "steps=" + steps +
                '}';
    }
}
