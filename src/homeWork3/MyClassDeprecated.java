package homeWork3;

public class MyClassDeprecated {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public String sum(String a, String b) {
        return a + b;
    }
    @Deprecated
    public int sum(byte a, short b) {
        return a + b;
    }
}
