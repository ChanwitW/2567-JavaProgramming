import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input product name : ");
		String productUnitStr = JOptionPane.showInputDialog("Input Product Unit : ");
		int productUnit = Integer.parseInt(productUnitStr);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit"));
		
		double totalPrice = productPrice * productUnit ;
		double totalVat = productPrice + (totalPrice * 7/100) ;
		
		//format output 
		String frmtotalPrice = String.format("%,.2f", totalPrice);
		String frmtotalVat = String.format("%,.2f", totalVat);
		
		//display result
		JOptionPane.showMessageDialog(null , "Total price is "+frmtotalPrice+ " baht. "
				+ "\nAdd VAT 7% is "+frmtotalVat+ " baht. ");

	}

}
