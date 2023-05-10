public class FibonacciLike implements Fibonacci, Runnable {
    int amountofNumbersInSequence = 10;
    int number1 = 0;
    int number2 = 1;

    public FibonacciLike (int amount, int number1, int number2){
        this.amountofNumbersInSequence = amount;
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public void run() {

        System.out.println("Sequence number: " + amountofNumbersInSequence);
        for (int i = 1; i <= amountofNumbersInSequence; i = i + 1) {
            int newNumber = number1 + number2;
            number1 = number2;
            number2 = newNumber;
            System.out.println("New sequence: " + newNumber);
           try {
               Thread.currentThread().sleep(1000);
           } catch (Exception ex) {
               Thread.currentThread().interrupt();
           }
       }
    }
}
