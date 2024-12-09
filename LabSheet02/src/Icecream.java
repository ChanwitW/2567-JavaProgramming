import javax.swing.*;
public class Icecream {
    public static void main(String[] args) {
        final int VANILLA_PRICE = 10;
        final int CHOCOLATE_PRICE = 15;
        final int TOPPING_PRICE = 5;

        int price = 0;
        String input = null;
        
        while (price == 0) {
            input = JOptionPane.showInputDialog(null,
                "[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\nPress number to choose flavor:",
                "Input", JOptionPane.QUESTION_MESSAGE);
            
                price = (input != null && input.equals("1")) ? VANILLA_PRICE : 
                (input != null && input.equals("2")) ? CHOCOLATE_PRICE : price;

        JOptionPane.showMessageDialog(null, 
            (price == 0) ? "ERROR: Wrong Choice! Try again." : "",
            "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        int addTopping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?", "Topping" , JOptionPane.YES_NO_OPTION);

        price += (addTopping == JOptionPane.YES_OPTION) ? TOPPING_PRICE : 0;

        String flavor = (price == VANILLA_PRICE || price == VANILLA_PRICE + TOPPING_PRICE) ? "Vanilla" : "Chocolate";
        String topping = (addTopping == JOptionPane.YES_OPTION) ? "with topping" : "no topping";

        JOptionPane.showMessageDialog(null,
            "You choose " + flavor + " Flavor\n" +
            "And " + topping + "\n" +
            "Total price = " + price + " baht.",
            "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}