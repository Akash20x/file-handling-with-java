import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


public class uppercase{

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("write.txt");
			FileWriter writer = new FileWriter("e.txt");

			int data;
			int data2;
			while((data=reader.read())!= -1) {
			  data2=Character.toUpperCase(data);
			  writer.write(data2);
			}
			reader.close();
	        writer.close();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


