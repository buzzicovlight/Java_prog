import java.util.Scanner;
public class App4 {
    public static void main(String[] args){
        /*System.out.println(10);
        System.out.println("Строка"); // то, что в кавычках - строка
        System.err.println("Ошибка"); // вывод ошибки
        //System.in.read();   // ввод . проблема то,что он читает 1 байт
        Scanner scanner = new Scanner(System.in); // ввод
        int i = scanner.nextInt();
        System.out.println(i);
        float[] f;
        System.out.print("Введите длину массива");
        int length = scanner.nextInt();
        f = new float[length];
        for (int j = 0; j <f.length; j++) {
            System.out.print("Введите число №"+(j+1));
            f[j] = scanner.nextFloat();
        }
        for (int j = 0; j < f.length ; j++) {
            System.out.println("Число"+(j+1)+"="+f[j]);
        }
        */
        System.out.println(String.format("%d %.2f",200,100.22123452f)); // форматирование вывода
        System.out.printf("%s,%g,%2.2f\n","Переменые",150.0f, 2e-1);  // форматирование вывода

        float max;
        float [] arr;
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in); // ввод
        int length = scanner.nextInt();
        arr = new float[length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("Введите %d - элемент ", (i+1));
            arr[i] = scanner.nextFloat();
        }
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr [i];
            }
        }
        System.out.printf("Максимум = %.1f",max);

    }
}
