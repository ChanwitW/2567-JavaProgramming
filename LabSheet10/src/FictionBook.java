import java.security.KeyStore.TrustedCertificateEntry;
import java.util.PrimitiveIterator.OfDouble;

import javax.naming.ldap.LdapName;

public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	
	public FictionBook(String title , int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorname(String name) {
		author_name = name;
		int space = author_name.indexOf(" ");
		fname = author_name.substring(0,space);
		lname = author_name.substring(space+1); 
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String getLastName() {
		return lname.toUpperCase();
	}
	
	@Override
	public String getFirstName() {
		return fname.toLowerCase();
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public int totalPublicYear() {
		return 2025 - this.publicYear;
	}
	
	@Override
	public boolean checkEmail() {
		if (this.email.endsWith(" @hotmail.com")) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() { 
		return this.getTitle() + 
				" write by " + this.getLastName().substring(0,1) +
				"." + this.getFirstName() + 
				"(" + this.getEmail() + ")" + 
				"\nPublished for " + this.totalPublicYear() + " year(s)" ;
	}
}
