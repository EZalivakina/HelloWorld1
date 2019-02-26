
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число: ");
            double t = new Scanner(System.in).nextDouble();
            double x = 10;
            double y = 5;
            double z = 9.5;
            if (t==x | t==y | t==z) {
                System.out.println("Данное значение имеется в константах");
            }
            else {
                System.out.println("Такой константы нет!");
                }
                 sc.close();
            }
        }



