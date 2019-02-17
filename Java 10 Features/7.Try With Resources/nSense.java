
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author nSense
 */
public class nSense {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("abc.txt");
        FileOutputStream fl = new FileOutputStream("qwe.txt");
        try(fr ; fl){
            System.out.println("Hello World");
        }
    }
}