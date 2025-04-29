/**Authors; Laone Joseph 202302410
            Pearl John 202304426
            Princess Maboshe 202304582
            Kabo Moseki 202301582
            Katlego Pansiri 202405134
   file name; InvalidProductExeception.java
   To compile; javac InvalidProductException.java
   To execute; java InvalidProductException
   Description; For handle errors for invalid product name input functionality
    */

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }

}
