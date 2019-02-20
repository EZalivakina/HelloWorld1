
    import java.util.Scanner;
    public class HelloWorld {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите число в бинарном формате: ");

                    String i = sc.next();

                    System.out.println(Integer.parseInt(i, 2));
                    sc.close();
            }
        }
