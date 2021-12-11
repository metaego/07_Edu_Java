package Sam02;

public class CreditCard {

    public long cardNumber;
    public String cardOwner;

    public long balance;
    public long point; // this.point의 point
 
    public void use(long amount) {
        balance += amount;
    }

    public void payBill(long amount) {
        balance -= amount;
        addPoint(amount / 1000);
    }
    private void addPoint(long point) {
        this.point += point;
    }

    // setter(값을 설정함)
    public void setCardNumber(long cardNumber) {
        // this.cardNumber = cardNumber;
        if (cardNumber < 1000_0000_0000_0000L) {
            System.err.println("카드번호에문제가 있다");
        } else {
            this.cardNumber = cardNumber;
        }
    }

    // getter(값을 가져옴)
    public long getCardNumber() {
        return cardNumber;
    }
}
