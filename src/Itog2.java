import java.util.Scanner;
public class Itog2 {
        public static void main(String[] args) {
        System.out.print("Ввидите длину массива: ");
        int  dlina = new Scanner(System.in).nextInt();
        int sort[] = new int[dlina];
        for (int i=0; i<dlina; i++) {
            System.out.print("Введите число в массив: ");
            int j = new Scanner(System.in).nextInt();
            sort[i]=j;
        }
        for (int i = sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sort[j] > sort[j + 1]) {
                    int tmp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = tmp;
                }
            }
        }
        System.out.println("Отсортировано пузырьковым методом:");
        for (int i=0; i<dlina; i++) {
            System.out.println("Элемент[" + i + "]:" + sort[i]);
        }
    }
}
