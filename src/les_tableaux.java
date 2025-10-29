import java.util.Arrays;

public class les_tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] TableNotes = {17, 12, 9, 8, 16, 13, 15};
		// TableNotes = new int[20]; //size of the table
		//TableNotes[0]= 57;
		System.out.println(TableNotes);
		System.out.println(Arrays.toString(TableNotes)); // convert elements in table to a string a human can read
		MinTable(TableNotes);
		MaxTable(TableNotes);
		AverageTable(TableNotes);
	}
		

	
	static void MinTable(int [] n) {
		int LowestNote = 20; // the notes are from 0 to 20
		
		//loop to check each value of the table
		for(int i = 0; i < n.length; i++){
			if(n[i] < LowestNote)
			LowestNote = n[i];
		 }
		System.out.println("Note la plus basse : " + LowestNote);
	}
	
	static void MaxTable(int[] n) {
		int HighestNote = 0; // the notes are from 0 to 20
		
		//loop to check each value of the table
		for(int i = 0; i < n.length; i++){
			 if(n[i] > HighestNote)
				 HighestNote = n[i];
		}
		System.out.println("Note la plus haute : " + HighestNote);
		
	}
	
	static void AverageTable (int [] n) {
		int Average = 0;
		int TempTotal = 0;
		for(int i = 0; i < n.length; i++){
			TempTotal += n[i];
		}
		Average = TempTotal / n.length;
		System.out.println("La moyenne des notes est : " + Average);
		
	}
	
	

}
