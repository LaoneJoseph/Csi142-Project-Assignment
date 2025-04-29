/**Authors; Laone Joseph 202302410
            Pearl John 202304426
            Princess Maboshe 202304582
            Kabo Moseki 202301582
            Katlego Pansiri 202405134
   file name; NegativePriceException.java
   To compile; javac NegativePriceException.java
   To execute; java NegativeException
   Description; For handle errors for hegative price values input functionality
    */

public class NegativePriceException extends Exception {
    public NegativePriceException() {
        super();
    }

    public NegativePriceException(String message) {
        super(message);
    }
}
