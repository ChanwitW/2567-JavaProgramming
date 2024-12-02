import javax.swing.*;
import java.util.*;
import java.util.PrimitiveIterator.OfDouble;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + balance + 
						"\nInput money to withdraw : "));
		
				
		if(moneyWithdraw > balance) 
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance", "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw > 50000) 
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than 50,000 Baht", "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw % 100 != 0) 
		{
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw " + (moneyWithdraw%100) + " Baht ", "ERROR" , JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Your withdraw is " + moneyWithdraw + " Baht. " +
					"\n1,000 - " + (moneyWithdraw/1000) + 
					"\n  500 - " + ((moneyWithdraw%1000)/500) + 
					"\n  100 - " + ((moneyWithdraw%500)/100)); 
		}
	}

}
