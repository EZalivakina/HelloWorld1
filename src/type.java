import java.util.Scanner;
public class type {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        String S = new Scanner(System.in).nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println("Строковый тип:"+S);
        System.out.println("Тип INT:"+X);
        System.out.println("Тип double:"+Y);
    }

}
