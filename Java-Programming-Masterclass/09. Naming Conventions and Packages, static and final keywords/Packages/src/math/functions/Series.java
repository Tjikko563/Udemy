package math.functions;

public class Series {
    public int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public long fibonacci(int n) {
        int previousN = 0;
        int currentN = 1;
        int nextN = 0;
        for (int i = 2; i < n; i++) {
            nextN = previousN + currentN;
            previousN = currentN;
            currentN = nextN;
        }
        return nextN;
    }
}
