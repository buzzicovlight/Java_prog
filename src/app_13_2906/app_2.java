package app_13_2906;

import java.util.ArrayList;

public class app_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Содержимое arrayList");
        for (Integer i:
             arrayList) {
            System.out.println(i);
        }
        System.out.println("Содержимое arrayList");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.add(arrayList.size()/2,42);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
