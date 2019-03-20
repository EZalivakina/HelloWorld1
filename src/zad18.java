import java.io.*;

public class zad18 {
    public static void main(String[] args) {
        String str;
        Integer i = 0;
        String c;
        try (BufferedReader br = new BufferedReader(new FileReader("C://Data//notes.txt"))) {
            while ((c = br.readLine()) != null) {
                System.out.println(c);
                i++;
            }
            try (FileWriter fw = new FileWriter("C://Data//notes.txt")) {
                System.out.print("Введите таеже кол-во строк, сколько вывелось на экран(кол-во. "+i+"):");
                for (int j = 1; j <= i; j++) {
                    BufferedReader bf = new BufferedReader(
                            new InputStreamReader(System.in));
                    str = bf.readLine();
                    str = str + "\r\n";
                    fw.write(str);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
