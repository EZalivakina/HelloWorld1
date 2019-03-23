import java.util.Scanner;

public class Itog3 {
    public static void main(String[] args) {
        System.out.println("Конвертер валют. Вводить только числа, дробные через ','");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс: ");
        double grnCourse = scanner.nextDouble();
        System.out.print("Введите кол-во рублей котое хотите обменять: ");
        double grnCount = scanner.nextDouble();
        double dol = grnCount / grnCourse;
        if (Double.isInfinite(dol)) {
        throw new ArithmeticException("Делить на ноль нельзя");
         }
             else {

            dol = Math.round(dol * 100) / 100.00;

            System.out.println("Вы можите купить " + dol + " $.");
           }

    }
}

