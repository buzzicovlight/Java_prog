import java.util.Scanner;

public class Lesson_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean isNumber = false;
            while(!isNumber){
                System.out.print("Введите число а = ");
                String s = sc.nextLine();
                try{
                    a = Integer.parseInt(s);
                    isNumber = true;
                } catch (NumberFormatException e){
                    System.out.println("Вы ввели не число");
                }
        }
        System.out.println("Вы ввели a = "+a);
    }
}
