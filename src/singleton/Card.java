package singleton;

public class Card {

  private static int serialNum = 10000;
  private int id;

  public Card () {
    Card.serialNum++;
    this.id = Card.serialNum;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCardNumber() {
    return id;
  }
//  private int cardNumber;
//  private static int serialNum = 10000;
//
//  public Card() {
//    Card.serialNum++;
//    this.cardNumber = Card.serialNum;
//  }
//
//  public int getCardNumber() {
//    return cardNumber;
//  }
//
//  public void setCardNumber(int cardNumber) {
//    this.cardNumber = cardNumber;
//  }
}
