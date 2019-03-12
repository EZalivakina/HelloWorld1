import java.util.Scanner;
public class Itog1 {
        public static void main(String[] args) {
            System.out.print("Ввидите число в бинарном формате: ");
            String  str = new Scanner(System.in).nextLine();
            int[] a = new int[str.length()];
        int sum = 0;
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(str.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a[i] = 1;
                else a[i] = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a[i] * Math.pow(2, i));
        }
        System.out.println("\"" + str + "\" -> " + sum);
    }
}


