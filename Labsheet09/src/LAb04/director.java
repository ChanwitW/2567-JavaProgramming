package LAb04;

public class director {
    private String name;
    private String email;
    private char gender;
    
    public director(String name , String email , char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public director(String name , String email) {
        this(name, email, '0');
    }
    
    public String getName() {
       return this.name;
   }
    
    public String getEmail() {
       return this.email;
   }
    
    public String getGenderName() {
       if (gender == 'm' || gender == 'M') {
           return "Male";
       }
       else if (gender == 'f' || gender == 'F') {
           return "Female";
       }
       else {
           return null;
       }
   }
    
   public String toString() {
       return name + "(" + email + ";" + getGenderName() + ")";
   }

}
