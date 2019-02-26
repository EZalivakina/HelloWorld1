
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int  t = new Scanner(System.in).nextInt();
            double  sample[] = new double [t];
            int i;
            for (i=0; i<t; i++) {
                System.out.print("Введите число в массив: ");
                double  num = new Scanner(System.in).nextDouble();
                sample[i] = num;
            }
            for (i=0; i<t; i++)
                System.out.println("Элемент[" + i + "]:" + sample[i]*2);

                 sc.close();
            }
        }



