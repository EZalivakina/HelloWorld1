
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите строку 1: ");
            String str1 = new Scanner(System.in).nextLine();
            int lstr1 = str1.length()-1;
            System.out.print("Введите строку 2: ");
            String str2 = new Scanner(System.in).nextLine();
            int lstr2 = str2.length()-1;
            if (lstr1 > lstr2) {
                System.out.print(str1);
            }
            else if (lstr2 > lstr1) {
                System.out.print(str2);
            }
            sc.close();
        }
    }


