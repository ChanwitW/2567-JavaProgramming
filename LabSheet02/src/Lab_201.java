
import java.text.DecimalFormat;
import javax.swing.*;
import java.text.*;

public class Lab_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUFFET = 299;
		double discount;
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberofCustomer * BUFFET;
		
		do {
				isMember = JOptionPane.showConfirmDialog(null ,
				"Total Price is " + totalPrice + " Baht "+
		        "\nDo you have a member card?");
		} while (isMember == 2);
		
		if (isMember == 0) 
		{
			discount = totalPrice*0.90;
			JOptionPane.showMessageDialog(null, "Amount to pe paid is " + frm.format(discount) + " Baht ");
		}
		else if (isMember == 1 ) 
		{
			JOptionPane.showMessageDialog(null, "Amount to pe paid is " + frm.format(totalPrice) + " Baht ");
		}


	}

}
