import java.util.Scanner;

/*
 * ���������� ������ ���������� �����, � ������ �� ��� ��������. ������ 562-> [5 6 2]
 */
public class Work_3 {
    public static void  main (String[] args ){
        int [] resArr;
        Scanner sc = new Scanner(System.in);
        System.out.println("�������� ����� ��� �������������� \n");
        String s = sc.nextLine();
        resArr = new int[s.length()];
        for ( int i = 0; i < s.length(); i++){
            resArr[i] = Character.digit(s.charAt(i),10);
            System.out.println(resArr[i]);
        }
    }
}