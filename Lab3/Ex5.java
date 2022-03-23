package Lab3;

import java.io.*;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\core-java-labs-agam\\src\\lab3\\new.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bufferReader = new BufferedReader(isr);
		
		String line;
		int c_char = 0;
		int w_count = 0;
		int sentenceCount = 0;
		
		while((line = bufferReader.readLine()) != null)
		{
			if(line.equals(""))
			{
			}
			else
			{
				c_char += line.length();
				String words[] = line.split("\\s+");
				w_count += words.length;
				String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
				
			}
		}
		if (sentenceCount >= 1) {
        }
		
		System.out.println("Number of characters : " + c_char);
		System.out.println("Number of lines : " + sentenceCount);
		System.out.println("Number of words : " + w_count);
		bufferReader.close();

		
	}

}
