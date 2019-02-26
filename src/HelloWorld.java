
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            double x = new Scanner(System.in).nextDouble();
            System.out.print("Введите число: ");
            double y = new Scanner(System.in).nextDouble();
            System.out.print("Введите число: ");
            double z = new Scanner(System.in).nextDouble();
            double avsum = (x+y+z)/3;
            System.out.println(avsum);
            int sum = (int)(avsum /= 2);
            if (sum>3) {
                System.out.println("Программа выполнена корректно");
            }
                 sc.close();
            }


        }



