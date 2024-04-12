package task11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExcep{
    public static void main(String[] args) throws FileNotFoundException{
        FileReader fileReader;
        try {
            fileReader=new FileReader("Program/Java/file1.txt");
            fileReader.read();

            fileReader.close();
        }
         catch (FileNotFoundException e) {
           System.out.println(e);
           System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
         }

      
        
    }
}
