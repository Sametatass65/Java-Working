import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = null;
        try {
             bufferedReader = new BufferedReader(new FileReader("C:\\Users\\samet\\IdeaProjects\\ExceptionDemo\\src\\sayilar"));
             String line = null;
             while ((line = bufferedReader.readLine()) != null){
                 System.out.println(line);
             }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            bufferedReader.close();
        }
    }
}