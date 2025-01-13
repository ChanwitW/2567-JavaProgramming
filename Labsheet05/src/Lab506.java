import javax.swing.*;

public class Lab506 {
    public static void main(String[] args) {
        String[] greetings = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};

        String message = "The greeting words in English:\n";

        for (String _greeting : greetings) {
            message += "- " + _greeting + "\n";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
