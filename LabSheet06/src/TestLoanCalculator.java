public class TestLoanCalculator {
    public static void main(String[] args) {
        //Create loan object
        LoanCalculator ln1 = new LoanCalculator();

        //Set loan detial
        ln1.setLoanDetails("Labtop", 50000, 5, 2);

        //Display loan detail
       ln1.DisplayLoanDetails();    

    }    
}
