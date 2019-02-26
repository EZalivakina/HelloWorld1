
    import java.util.Scanner;
    public class HelloWorld {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество строк: ");
            int  s = new Scanner(System.in).nextInt();
            System.out.print("Введите количество столбцов: ");
            int  t = new Scanner(System.in).nextInt();
            double  sample[][] = new double [s][t];
            int i,j;
            for (i=0; i<s; ++i) {
                for (j = 0; j < t; ++j) {
                    System.out.print("Введите число в матрицу: "+" "+i+" "+j+": ");
                    double num = new Scanner(System.in).nextDouble();
                    sample[i][j] = num;
                }
            }
            for (j=0; j<t; j++)
                System.out.println("Элемент[0][" + j + "]:" + sample[0][j]*3);

                 sc.close();
            }
        }



