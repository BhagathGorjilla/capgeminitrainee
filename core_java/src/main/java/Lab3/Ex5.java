package Lab3;
import java.io.*;			

public class Ex5 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text : ");
		String txt = br.readLine();
		int charCount = 0, wordCount = 0, lineCount = 0;

		charCount = txt.length();

		// String[] wordList = txt.split(" ");
		// wordCount = wordList.length;
		wordCount = txt.split(" ").length;

		String[] lineList = txt.split("\n");
		lineCount = lineList.length;
		//lineCount = txt.split("\n").length;

		System.out.println("Number of Character : " + charCount 
				+ "\nNumber of Words : " + wordCount
				+ "\nNumber of Lines : " + lineCount);
	}

}