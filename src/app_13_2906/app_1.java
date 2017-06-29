package app_13_2906;
import sun.reflect.generics.tree.Tree;
import javax.xml.soap.SOAPPart;
import java.util.*;

public class app_1 {
    public static void main(String[] args) {
        //множество с уникальынми значениями
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(3);
        for (Integer h : hs ) {
            System.out.println(h);
        }
        hs.remove(5);
        hs.remove(4);
        for (Integer h : hs ) {
            System.out.println(h);
        }
        TreeSet<Float> ts = new TreeSet<>();
        for (int i = 0; i < 20; i++) {
            ts.add(i*0.1f);
        }
        System.out.println("Содержимое TreeSet");
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.subSet(1.0f,1.5f));
    }
}
