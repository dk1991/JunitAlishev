public class FuncMath {
    int calls;

    public int getCalls() {
        return calls;
    }

    public long factorial(int number) {
        calls++;

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
        }

        return result;
    }

    public long plus(int a, int b) {
        calls++;

        return a + b;
    }
}