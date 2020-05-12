import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args){

        int i;

        try(FileInputStream filein = new FileInputStream("C:\\Users\\Иван\\Desktop\\File.txt");
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\Иван\\Desktop\\File2.txt")) {
            System.out.println("Files are opened");
            do {
                i = filein.read();
                if (i != -1) {fileout.write(i);}
            } while (i != -1);
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error with reading/writing file");
        }
    }
}
