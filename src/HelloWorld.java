
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите текст: ");
            String s = new Scanner(System.in).nextLine();
            String str = s.replaceAll(" ", "");
            System.out.print(str);
            sc.close();
        }
    }


