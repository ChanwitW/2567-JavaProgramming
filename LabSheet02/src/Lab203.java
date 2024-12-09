import javax.swing.*;
public class Lab203 {
    public static void main(String[] args) {
        
        String inpuetWeight = JOptionPane.showInputDialog(null, "Input Weight");
        double weight = Double.parseDouble(inpuetWeight);

        String inpuetHeight = JOptionPane.showInputDialog(null, "Input Height");
        double height = Double.parseDouble(inpuetHeight);

        double bmi = weight / ((height/100) * (height/100));
        String frmBmi = String.format("%.1f", bmi);

        if (bmi < 18.5 ) {
            JOptionPane.showMessageDialog(null, "BMI = " + frmBmi + "\nYou're Underweight" , "BMI" , JOptionPane.WARNING_MESSAGE);
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            JOptionPane.showMessageDialog(null, "BMI = " + frmBmi + "\nYou're Normal-weight" , "BMI" , JOptionPane.WARNING_MESSAGE);
        }
        else if (bmi >= 25.0 && bmi <= 29.9) {
            JOptionPane.showMessageDialog(null, "BMI = " + frmBmi + "\nYou're Over-weight" , "BMI" , JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "BMI = " + frmBmi + "\nYou're Obesily" , "BMI" , JOptionPane.WARNING_MESSAGE);
        }
    }
}
