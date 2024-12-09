
import javax.swing.*;
public class Lab104 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");

        String employeeName = JOptionPane.showInputDialog(null, "Enter employee name");
        
        String hourWorkedinput = JOptionPane.showInputDialog(null, "Enter total hours for this employee");
        double hourWork = Double.parseDouble(hourWorkedinput);

        double grossEarning = hourWork * 7.5 ;

        double taxRate = 0.15;
        double tax = grossEarning * taxRate;
        double netEarning = grossEarning - tax;

        JOptionPane.showMessageDialog(null, "Emplyee name : " + employeeName + 
        "\nHours worked: " + hourWork + "\nHourly Wage: $ 7.5" + "\nGross earning: $ " + grossEarning +
        "\nTax rate:0.15" + "\nTax: $ " + tax + "\nNet earning: $ " + netEarning);
    }
}

