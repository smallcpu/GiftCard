//Task1:Currency with $ and two decimal places and display to user
import javax.swing.JOptionPane;
public class TestGiftCards 
//Jorell Socorro
{
	public static void main(String[] args) 
	{
		GiftCards gc = new GiftCards("", 0.0);
		
		// display opening message
		String message = "welcome";
		JOptionPane.showMessageDialog(null, "Message: " + message,
		"Message", JOptionPane.PLAIN_MESSAGE);	
		
		// set the gift card holder's name
		//**NOTE str is the user input that will modify JOptionPane
		String str = 
		JOptionPane.showInputDialog(null, "gift card holder's name : ");
		gc.setHolder(str);//grabs basic info from parent class and sets the data here in the main class
		
		// obtain the gift card number
		str = JOptionPane.showInputDialog(null, "gift card number : ");
		gc.cardNum = Integer.parseInt(str);//grabs basic info from parent class and sets the data here in the main class
		
		// set the gift card amount
		str = JOptionPane.showInputDialog(null, "gift card amount : ");
		gc.setBalance(Double.parseDouble(str));//grabs basic info from parent class and sets the data here in the main class
		
		// set the card type
		str = JOptionPane.showInputDialog(null, "Card Type: 'S' for store credit 'R' for regular purchase");
		gc.setCardType(str);
		
		// issue the gift card
		gc.IssueGiftCard();//grabs basic info from parent class 
		
		// use the gift card
		double useCard = 0;
		str = 
		JOptionPane.showInputDialog(null, "deduct amount from card : ");
		useCard = Double.parseDouble(str);
		//jorell
		gc.setDeduct(useCard);//goes to parent class and calls setDeduct method		
		// verify amount to deduct will not yield negative balance
		gc.setNewBalance();
		
		
		
		// print current card balance
		gc.printCurrentGiftCardInfo(useCard);//grabs basic info from parent class and sets the data here in the main class
	}
}
