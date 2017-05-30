import java.util.Scanner;
/*
<<<<<<< HEAD
Напишите метод, который будет увеличивать заданный элемент массива на 10%
 */public class Work_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float [] arr = null;
        int length = 0;
        String temp = null;
        boolean isNumber = false;
        while(!isNumber) {       // проверка на правильность числового значения
            System.out.print("Введите величину массива ");
            temp = sc.nextLine();
            try {
                length = Integer.parseInt(temp);,
                isNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        }
        arr = new float [length];
        for (int i = 0; i < arr.length ; i++) {
            isNumber = false;   // обнуление значения логической переменной для проверки правильности ввода числового значения
            while (!isNumber) {
                System.out.printf("Введите %d - массива ", (i+1));
                temp = sc.nextLine();
                try {
                    arr[i] = Float.parseFloat(temp);
                    isNumber = true;
                } catch (NumberFormatException e) {
                    System.out.printf("Вы не ввели %d элемент массива ", (i+1));
                }
            }
        }
        float [] resultarr;
        resultarr = new float[length];
        System.out.println("Массив,увеличенный на 10 процентов \n");
=======
???????? ?????, ??????? ????? ??????????? ???????? ??????? ??????? ?? 10%
 */public class Work_1 {
    public static void main(String[] args){
        float [] arr;
        System.out.println("??????? ????? ???????");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();          // ?????????? ??????
        int length = Integer.parseInt(s);  // ?????????????? ? ??????? ?? ??????
        arr = new float [length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("??????? %d - ??????? ", (i+1));
            s = sc.nextLine();
            arr [i] = Float.parseFloat(s);
        }
        float [] resultarr;
        resultarr = new float[length];
        System.out.println("??????,???????????? ?? 10 ????????? \n");
>>>>>>> 0a398cc42434d21e872580e2094c4f70a2acb236
        for (int i = 0; i < arr.length ; i++) {
            resultarr[i] = 0.1f*arr[i]+arr[i];
            System.out.println(resultarr[i]);
        }
    }
}
