package Lab05;
import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter data again? : ");
		String choose = console.next().toLowerCase();
		
		while (!choose.equals("insert") && !choose.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choose = console.next().toLowerCase();
		}//end while
		
		//สร้าง object เพื่อนเรีหใช้ class SaveAndOpen
		SaveandOpen objFile = new SaveandOpen();
		if (choose.equals("insert")) {
			objFile.insert();
		}
		else {
			//ใช้ค้นหาข้อมูลแผนกที่ต้องการ
			System.out.print("\nEnter dapt : ");
			String dept = console.next();
			objFile.setDept(dept);
			objFile.searchData();
		}
	}

}
