public class Lab605_TestIncomeTaxCalculator {
    public static void main(String[] args) {
        //Create object
        Lab605_IncomeTaxCalculator tc = new Lab605_IncomeTaxCalculator();

        //Set TaxCalculator detail
        tc.setIncome(450000);

        //Display Taxcalculator detail
        tc.displayTaxDetails();
    }
}
