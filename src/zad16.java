
import java.io.*;
import java.nio.Buffer;

public class zad16 {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new FileReader("C://Data//notes.txt")))
        {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}


