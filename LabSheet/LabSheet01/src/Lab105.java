import javax.swing.*;
public class Lab105 {
    public static void main(String[] args) {
        String cdId = JOptionPane.showInputDialog(null, "This program calculates the total cost of a CD order\nPlease enter the ID of the CD");
        int idOfCd = Integer.parseInt(cdId);

        String cdTitle = JOptionPane.showInputDialog(null, "Please enter the title of the CD");
        String titleOfCd = cdTitle;  

        String cdPrice = JOptionPane.showInputDialog(null, "Please enter the price of the CD in U.S. dollars");
        double priceOfCd = Double.parseDouble(cdPrice);

        String cdQuantity = JOptionPane.showInputDialog(null, "Please enter the quantity to be purchased");
        int quantityOfCd = Integer.parseInt(cdQuantity);

        double cdSubtotal = priceOfCd * quantityOfCd;
        double taxRate = 0.0625; 
        double cdTotal = cdSubtotal * (1 + taxRate);

        JOptionPane.showMessageDialog(null, "Summary of the transaction:" + "\n" + "\n" + "CD ID:" + idOfCd + "\nCD Title: " + titleOfCd +
        "\nCD Unit Price: $"+ priceOfCd + "\nCD Quantitly: " + quantityOfCd + "\n" + "\n" + "Subtotal: $" + cdSubtotal + 
        "\nTax Rate: 6.25%" + "\nTotal: $" + cdTotal + "\n" + "\n" + "End of Program");
    }
}
