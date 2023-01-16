import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.text.Style;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creatFile();
        //fileInfo();
      /*  try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\samet\\Desktop\\file\\file.txt"));
            String line = null;
            while((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        readFile();
        writeToFile();


    }
    public static void creatFile()
    {
        File file = new File("C:\\Users\\samet\\Desktop\\file\\file.txt");

        try {
            if(file.createNewFile())
                System.out.println("Dosya oluşturuldu");
            else
                System.out.println("Oluşturrcağınız dosya zaten oluşturlmuş");
        }catch (Exception exception)
        {
            System.out.println(exception);
        }
    }
    public static void fileInfo()
    {
        File file = new File("C:\\Users\\samet\\Desktop\\file\\file.txt");

        if(file.exists())
        {
            System.out.println("file is name : " + file.getName());
            System.out.println("path of the file : " + file.getAbsolutePath());
            System.out.println("Is the file writable ? " + file.canWrite());
            System.out.println("Is the file readtable ? " + file.canRead());
            System.out.println("size of the file :" +file.length());
        }else
            System.out.println("a file not found");

    }
    public static void readFile()
    {
        File file = new File("C:\\Users\\samet\\Desktop\\file\\file.txt");
        try {
            Scanner read = new Scanner(file);
            while(read.hasNextLine())
            {

                String line = read.nextLine();
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile()
    {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\samet\\Desktop\\file\\file.txt",true);
            writer.write("berna sameti seviyor");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }























}