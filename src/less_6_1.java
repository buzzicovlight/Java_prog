import java.util.Scanner;
public class less_6_1 {
    public static void main(String[] args) {
        String s = null;
        list list = new list();
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.printf("Длина строки  = %d \n",s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                list.pushHead(c);
            } else if (c == ')') {
                if (list.getSize() == 0) {
                    System.out.printf("Строка не сбалансированна ");
                    System.exit(0);
                } else {
                    char ch = list.pullHead();
                }
            }
            System.out.printf("?????? ??????  = %d \n",s.length());
        }

        if (list.getSize() != 0){
            System.out.println("?????? ?? ??????????????");

        }else{
            System.out.println("?????? ???????????????");
        }
    }
}
