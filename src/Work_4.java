import java.util.Scanner;

/**
 * ������������ ������ ���������� �� ����� ���������� N � �����, �� ������ ����� ������� T. ��������� ���������,
 * � ������� ����� �����.
 */
public class Work_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float destination ;
        float time ;
        float speed;
        String temp;
        System.out.println("�������� ���������� ");
        temp = sc.nextLine();
        destination = Float.parseFloat(temp);
        System.out.println("�������� ����� ");
        temp = sc.nextLine();
        time = Float.parseFloat(temp);
        speed = destination/time;
        System.out.println(speed);

    }
}
