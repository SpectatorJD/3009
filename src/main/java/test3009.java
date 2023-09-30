import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test3009 {
    public static void main (String [] args) throws IOException{
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Desktop\text.txt"));
            String fistString = reader.readLine();
            System.out.println(fistString);

        }
        catch (FileNotFoundException e) {
            System.out.println("Error! File not found!");
        }
    }
}

