import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fr= new FileInputStream("C:/Users/matam/Downloads/junk.txt");
BufferedInputStream bin= new BufferedInputStream(fr);	

		int i;
		
		while((i=bin.read())!=-1) {
			System.out.println((char)i);
			
		}
		bin.close();

		fr.close();
	}

}
