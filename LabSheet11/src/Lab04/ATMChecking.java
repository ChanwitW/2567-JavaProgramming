package Lab04;
import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData{
	private int money;
	
	public ATMChecking(String accountNumber , String password , int money) {
		super(accountNumber , password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException {
		return true;
	}
}
