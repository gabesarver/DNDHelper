import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterIO {
	
	public ArrayList<Character> loadCharactersFromFile(String fileName) {
		
		Scanner scan;
		File characters;
		ArrayList<Character> character = null;
		
		try {
			characters = new File(fileName);
			scan = new Scanner(characters);
			
		}
		catch (FileNotFoundException e) {
			throw new IllegalArgumentException("No file found");
		}
		
		return character;
		
	}
	
	public static void writeCharactersFile(String fileName, ArrayList<Character> characters) throws IOException {
		
		PrintStream fileWriter = new PrintStream(new File(fileName));
		
		for (int i = 0; i < characters.size(); i++) {
			
			fileWriter.println(characters.get(i).toString());
			
		}
		
		fileWriter.close();
		
	}
	
	
}
