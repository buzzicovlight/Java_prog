import java.util.Scanner;
/*
�������� �����, ������� ����� ����������� �������� ������� ������� �� 10%
 */
public class Work_1 {
    public static void main(String[] args){
        float [] arr;
        System.out.println("������� ����� �������");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();          // ���������� ������
        int length = Integer.parseInt(s);  // �������������� � ������� �� ������
        arr = new float [length];
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("������� %d - ������� ", (i+1));
            s = sc.nextLine();
            arr [i] = Float.parseFloat(s);
        }
        float [] resultarr;
        resultarr = new float[length];
        System.out.println("������,������������ �� 10 ��������� \n");
        for (int i = 0; i < arr.length ; i++) {
            resultarr[i] = 0.1f*arr[i]+arr[i];
            System.out.println(resultarr[i]);
        }
    }
}
