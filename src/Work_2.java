import java.util.Scanner;
/**
 * �������� �����, ���������� � ������ ��� ��������� ����� "Fuck" �� "Censored"
 */
public class Work_2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String source;
        String result;
        System.out.println("������� ������ ��� ������");
        source = sc.nextLine();
        result = source.replaceAll("Fuck", "Censored");
        System.out.println(result);
    }

}
