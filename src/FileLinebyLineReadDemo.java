import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileLinebyLineReadDemo {
	
	public static void main(String args[]) throws IOException {
		FileInputStream fr= new FileInputStream("C:/Users/matam/Downloads/junk.txt");
		Scanner sc= new Scanner(fr);	
				int i;
				
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
					
				}
				sc.close();

				fr.close();
			}

	}


