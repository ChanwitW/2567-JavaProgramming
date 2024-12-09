import javax.swing.*;
public class Lab103 {
    public static void main(String[] args) {
        String parkingTime = JOptionPane.showInputDialog(null, "Input Time Parking (minutes): ");
        int allMinutes = Integer.parseInt(parkingTime);      
       
        int hours = allMinutes / 60;
        int minutes = allMinutes % 60;
     
        double hourRate = 50.0;
        double minuteRate = 0.25;
        
        double totalPrice = (hours * hourRate) + (minutes * minuteRate);
       
        String formattedPrice = String.format("%.2f", totalPrice);
        
        JOptionPane.showMessageDialog(null, "You parked for " + hours + " hours and " + minutes + " minutes.\n"
                + "Amount to be paid is " + formattedPrice + " baht.");
    }
}