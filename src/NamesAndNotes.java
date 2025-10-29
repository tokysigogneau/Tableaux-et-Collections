import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class NamesAndNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ask_user will be used whenever we need information from the user
		Scanner ask_user = new Scanner(System.in);
		
		//I create list of list depending on the number of students
		System.out.println("combien d'élèves avez vous ?");
		String TotalStudentsStr = ask_user.nextLine();
		int TotalStudents = Integer.parseInt(TotalStudentsStr);
		
        // list with student's names
        List<String> StudentNames = new ArrayList<>();

        // list with  their score
        List<List<Integer>> StudentNotes = new ArrayList<>();
		

		//this loop will go for each students in the class
		for(int i = 0; i < (TotalStudents*2); i++ ) {

			
			System.out.println("Quel est le nom et prénéom de l'élève ?");
			String StudentName = ask_user.nextLine();
			StudentNames.add(StudentName); // Add the student's name to the list StudentNames
			
			//System.out.println("Combien de notes chaque élève possède?");
			//String NumberOfNotesStr = ask_user.nextLine();
			
			//int NumberOfNotes = Integer.parseInt(NumberOfNotesStr);
			//String CurrentStudent = "";
			
			System.out.println("Quelles sont les notes de cet élève actuel?");
			
			String CurrentStudentNotes = ask_user.nextLine();
			String [] NotesArray = CurrentStudentNotes.split(" ");
			
			//Temporary list i will add to the list of list after the loop
			List<Integer> TempStudentArray = new ArrayList<>();
			
			for (String numbers : NotesArray ) {
				int number_int;
				try {
					number_int  = Integer.parseInt(numbers);
					TempStudentArray.add(number_int);
				}
				catch (Exception e) {
					System.out.println(numbers +" n'est pas un nombre correct");
					
				}
			StudentNotes.add(TempStudentArray);
			

			
			List<Integer> Notes1 = new ArrayList<>();
			Notes1.add(12); //Create loop to add each element from Scanner 1 by 1
		}
			//Check the values outside the insertion loop
			System.out.println("L'élève " + StudentNames.get(i) + " a ces notes : " +StudentNotes.get(i));
		

		
		
	}
		ask_user.close();
}
}
