import java.awt.Component;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;
//Jorell Socorro
public class GiftCards
{
  static NumberFormat nf = NumberFormat.getCurrencyInstance();
//jorell
  static DecimalFormat Currency = new DecimalFormat("$0.00");
  Random randomGen = new Random();
  Date myDate = new Date();
  String myDateFormat = "MM/dd/yyyy";
  SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
      
  // define the class data members 
  public boolean expires;
  private double balance;
  public int cardNum;
  private char cardType;
  public String issueDate;
  private String holder; 
  public double deduct;
  public int year;
  private String cType;
  
  // define the member methods
  // default constructor
  public GiftCards() {}
  // overloaded constructor
  public GiftCards(String n, double amt) 
  {
    holder = n;
    balance = amt;
  }
  public void IssueGiftCard() 
  {
	  System.out.println("");
	  System.out.println(" Card Issued");
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.println(" Card Holder . . . " + holder);
	//jorell
	  //Put in the card number
	  System.out.println(" Card Number . . . " + cardNum);
	  //adjusted the $ format
	  System.out.println(" Card Amount . . . " + (Currency.format(balance)));
	  //calls the set year method to give it a random year number
	  System.out.println(" Card Expires . . . " + setYear());
	  //card type
	  System.out.println(" Card Type . . . " + cType);
	//jorell
	  
  }
  public double getBalance()
  {
    return balance;
  }
  public void setBalance(double b) 
  {
    balance = b;
  }
  public String getHolder()
  {
    return holder;
  }
  public void setHolder(String h) 
  {
    holder = h;
  }
  
  //jorell//////////////////////////
  //sets the deducts and subtracts the deduct amount with balance and returns
  public void setDeduct(double d) {
	  deduct = d;
	  balance = balance - d;
  }
  //Sets the new balance (Used to check if it is negative)
  public void setNewBalance() {
	  if(balance < 0) {
		  //System.out.println(" You ran out of money");
		  JOptionPane.showMessageDialog(null, "You ran out of money");
		  balance = 0;
	  }
	  else
		  JOptionPane.showMessageDialog(null, "You still have money");
  }
  //sets the year with random numbers
  public int setYear() {
	  int num = randomGen.nextInt((2025 - 2020)) + 2020;
	  year = num;
	  return year;
  }
  //sets the card type
  public void setCardType(String type) {
	  if(type.equals("S") || type.equals("s") || type.equals("R") || type.equals("r"))
		  cType = type;
	  else {
		cType = "error";
	  	JOptionPane.showMessageDialog(null, "Message: Please try again, you did not choose 'r' or 's'",
				"Message", JOptionPane.PLAIN_MESSAGE);
	  	System.exit(0);
	  }
  }
  public String getCardType() {
	  return cType;
  }
  //jorell/////////////////////////////////////////////
  
  
  public void printCurrentGiftCardInfo(double spend) 
  {
	  System.out.println("");
	  System.out.println(" Card Balance");
	  System.out.println(" Today's Date is: " + dtToday.format(myDate));
	  System.out.println(" Deducted . . . " + (Currency.format(deduct)));
      //jorell
	  //adjusted the $ format
	  System.out.println(" Card Amount . . . " + (Currency.format(balance)));
  }
}
