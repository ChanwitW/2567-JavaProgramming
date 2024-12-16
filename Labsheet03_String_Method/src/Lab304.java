import javax.swing.JOptionPane;
public class Lab304 {
    public static void main(String[] args) {
        
         String fullName = JOptionPane.showInputDialog("Enter Full Name : ");

       
        if (fullName == null || !fullName.contains(" ") || fullName.indexOf(" ") != fullName.lastIndexOf(" ")) {
            JOptionPane.showMessageDialog(null, "Incorrect Name");
        } else {
            
            int spaceIndex = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spaceIndex).toUpperCase();
            String lastName = fullName.substring(spaceIndex + 1).toLowerCase();

            
            String result = "Full Name: " + fullName + "\n"
                          + "First Name: " + firstName + "\n"
                          + "Last Name: " + lastName;

            JOptionPane.showMessageDialog(null, result);
        }
    }
}

