package LAb04;

public class Theater extends Movie {
    private int theaterNo;

    public Theater(String id, String name, director director , int theaterNo) {
        super(id , name , director);
        this.theaterNo = theaterNo;
    }

    public Theater() {
        super();
        this.theaterNo = 0;
    }

    public String getTheaterName() {
        return (theaterNo >= 1 && theaterNo <= 11) ? "Basic Theater" : 
               (theaterNo <= 14) ? "Sweet Theater"  :
               (theaterNo == 15) ? "Premium Theater" : null;
    }

    public String toString () {
        return getTheaterName() + " : " + super.toString();
    }
}
