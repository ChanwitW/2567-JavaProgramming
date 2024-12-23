import java.util.Scanner;
public class Lab404 {
    public static void main(String[] args) {
        inputStudent();
    }
    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        String studentID, subjectCode;
        boolean isStudentIDValid, isSubjectCodeValid;

        while (true) 
        {
            System.out.print("Enter student ID   : ");
            studentID = scanner.nextLine();

            System.out.print("Enter subject code : ");
            subjectCode = scanner.nextLine();

            isStudentIDValid = isLength(studentID, 10);
            isSubjectCodeValid = isLength(subjectCode, 7);

            if (isStudentIDValid && isSubjectCodeValid) 
            {
                boolean isITStudent = isITStudent(studentID);
                boolean isITSubject = isITSubject(subjectCode);

                displayData(isITStudent, isITSubject, studentID);
                break;
            
            } 
        }
        scanner.close();
    }

    public static boolean isLength(String input, int requiredLength) {
        return input.length() == requiredLength;
    }

    public static boolean isITStudent(String studentID) {
        return studentID.substring(2, 3).equals("1") && studentID.substring(3, 6).equals("311");
    }

    public static boolean isITSubject(String subjectCode) {
        return subjectCode.substring(0, 2).equals("21") && subjectCode.substring(4, 5).equals("1");
    }

    public static void displayData(boolean isITStudent, boolean isITSubject ,String studentID) {
        if (isITStudent && isITSubject) 
        {
            System.out.println("Student id: " + studentID + " " + "1st year student in IT and" + "\nEnrolll in courses for Year 1");
        } 
        else if (isITStudent && !isITSubject)
        {
            System.out.println("Student id: " + studentID + " " + "1st year student in IT and" + "\nnot enrolll in courses for Year 1");
        }
        else if (!isITStudent && isITSubject) 
        {
            System.out.println("Student id: " + studentID + " " + "is not 1st year student in IT and" + "\nEnrolll in courses for Year 1");
        }

    }
}