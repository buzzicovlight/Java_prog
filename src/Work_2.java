import java.util.Scanner;
/*
 * Напишите метод, заменяющий в строке все вхождения члова Fuck на слов Censored"
 */
public class Work_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String source;
        String result;
        System.out.println("Введите строку для проверки");
        source = sc.nextLine();
        result = source.replaceAll("Fuck", "Censored");
        System.out.println(result);
    }

}
