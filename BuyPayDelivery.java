/**Authors; Laone Joseph 202302410
            Pearl John 202304426
            Princess Maboshe 202304582
            Kabo Moseki 202301582
            Katlego Pansiri 202405134
 File name;BuyPayDelvery.java
 To compile; javac BuyPayDelivery.java
 To run; java BuyPayDelivery
 Description; For the current scope of the assignment,BuyPayDelivery.java file is not a necessary component.
            However, it has been proactively developed to support potential future enhancements and feature additions.
*/

public class BuyPayDelivery{

    private String paymentMethod;
    private double deliveryCosts;
    private String deliveryPlace;
    private String payerName;
    private String payerEmail;
    private String cardHolder;
    private int cardNumber;


    public BuyPayDelivery(String paymentMethod, double deliveryCosts, String deliveryPlace, 
                           String payerName, String payerEmail, String cardHolder, int cardNumber){

        this.paymentMethod = paymentMethod;
        this.deliveryCosts = deliveryCosts;
        this.deliveryPlace = deliveryPlace;
        this.payerName = payerName;
        this.payerEmail = payerEmail;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public String getPaymentMethod(){return paymentMethod;}
    public double getDeliveryCosts(){return deliveryCosts;}
    public String getDeliveryPlace(){return deliveryPlace;}
    public String getPayerName(){return payerName;}
    public String getPayerEmail(){return payerEmail;}
    public String getCardHolder(){return cardHolder;}
    public int getCardNumber(){return cardNumber;}

    public void setPaymentMethod(String paymentMethod){this.paymentMethod = paymentMethod;}
    public void setDeliveryCosts(double deliveryCosts){this.deliveryCosts = deliveryCosts;}
    public void setDeliveryPlace(String deliveryPlace){this.deliveryPlace = deliveryPlace;}
    public void setPayerName(String payerName){this.payerName = payerName;}
    public void setPayerEmail(String payerEmail){this.payerEmail = payerEmail;}
    public void setCardHolder(String cardHolder){this.cardHolder = cardHolder;}
    public void setCardNumber(int cardNumber){this.cardNumber = cardNumber;}

    @Override
         public String toString(){
            return paymentMethod + " ,"+"\n "+ deliveryCosts +",\n"+ deliveryPlace+",\n"+ payerName + ",\n"+payerEmail+ ",\n"+ cardHolder+",\n"+cardNumber+",\n";
         }

}
