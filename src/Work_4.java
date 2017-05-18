import java.util.Scanner;

/**
 * Пользователь вводит расстояние до места назанчения N и время, за кторое нужно доехать T. Вычислить скоровсть,
 * с которой нужно ехать.
 */
public class Work_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float destination ;
        float time ;
        float speed;
        String temp;
        System.out.println("Ввевдите расстояние ");
        temp = sc.nextLine();
        destination = Float.parseFloat(temp);
        System.out.println("Ввевдите время ");
        temp = sc.nextLine();
        time = Float.parseFloat(temp);
        speed = destination/time;
        System.out.println(speed);

    }
}
