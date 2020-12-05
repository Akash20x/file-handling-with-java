import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


public class uppercase {

	public static void main(String[] args) {
		
      try {
        FileReader reader = new FileReader("e.txt");
        String result = "";
        int data;
        int data2;
        while ((data = reader.read()) != -1) {
           data2 = Character.toUpperCase(data);
           result += (char)data2;
        }
        reader.close();
        FileWriter writer = new FileWriter("e.txt");
        writer.write(result);
        writer.flush();
        writer.close();
         }
 
      catch (FileNotFoundException e) {
            e.printStackTrace();
    } catch (IOException e) {
         e.printStackTrace();
    }
  }
}

