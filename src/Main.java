public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence started!");
        FibonacciLike fibonacci1 = new FibonacciLike(5, 0, 1);
        FibonacciLike fibonacci2 = new FibonacciLike(5, 5, 8);
        Thread fibonacciThread1 = new Thread(fibonacci1);
        Thread fibonacciThread2 = new Thread(fibonacci2);
        fibonacciThread1.start();
        fibonacciThread2.start();
    }
}