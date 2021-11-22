import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	
	public static void main (String[] args ) throws IOException {
		
		FileInputStream fr= new FileInputStream("C:/Users/matam/Downloads/junk.txt");
		
		int i;
	
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
			
		}
		fr.close();
	}

}
