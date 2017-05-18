import java.util.Scanner;
/*
Напишите метод, который будет увеличивать заданный элемент массива на 10%
 */
public class Work_1 {
    public static void main(String[] args){
        float [] arr;
        System.out.println("Введите длину массива");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();          // считывание строки
        int length = Integer.parseInt(s);  // преобразование в интежер из строки
        arr = new float [length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("Введите %d - элемент ", (i+1));
            s = sc.nextLine();
            arr [i] = Float.parseFloat(s);
        }
        float [] resultarr;
        resultarr = new float[length];
        System.out.println("Массив,увеличеннный на 10 процентов \n");
        for (int i = 0; i < arr.length ; i++) {
            resultarr[i] = 0.1f*arr[i]+arr[i];
            System.out.println(resultarr[i]);
        }
    }
}
