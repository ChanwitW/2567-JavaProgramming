import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		// กำหนด object ในการรับข้อมูลทาง console
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many student in classrooms: ");
		int numberofStudent = scanner.nextInt();
		scanner.nextLine();
		//Array object step 1 create an array of student object
		student[] students = new student[numberofStudent];
		
		for (int i = 0; i < numberofStudent; i++) {
			students[i] = new student();
			System.out.println("\nINPUT INFORMATION OF STUDENT " + (i+1));
			Line();
			//แสดงข้อความและรับข้อมูชื่อ 
			
			System.out.print("Input student name: ");
			students[i].setName(scanner.nextLine())
			/*String stdName = scanner.nextLine();
			students[i].setName(stdName);*/;
			
			System.out.print("Input student score: ");
			int stdScore = scanner.nextInt();
			scanner.nextLine();
			students[i].setScore(stdScore);
			while (!students[i].checkScore()) {
				System.out.print("Input student score, againd: ");
				stdScore = scanner.nextInt();
				students[i].setScore(stdScore);
			}//end of while
		}//end for ()

		System.out.println("\nLIST OF PASS STUDENT (>=50)");
		Line();
		//using foreach
		for (student student : students) {
			if (student.isPass()) {
				System.out.println(">> " + student.getName() + " (" + student.getScore() + ")"  + 
			" get grade " + findGrade(student.getScore()));
				
			}
		}//end of foreach
		
		scanner.close();
	}//end main method

	public static String findGrade(int score) {
		if (score >= 80) return "A" ;
		else if (score >= 75) return "B+";
		else if (score >= 70) return "B";
		else if (score >= 65) return "C+";
		else if (score >= 60) return "C";
		else if (score >= 55) return "D+";
		else if (score >= 50) return "D";
		else return "F";
		
	}
	
	public  static void Line() {
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		
	}
}//end class
