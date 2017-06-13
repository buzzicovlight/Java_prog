package l1306;

import java.lang.reflect.Field;

public class App {
    public static void main (String[] args){
        Ant ant = new Ant();
        ant.walk();

        Fish fish = new Fish();
        fish.swim();

        Frog frog  = new Frog();
        frog.swim();
        frog.walk();

        DefClass1 df1 = new DefClass1();
        System.out.println(df1.getInt());
        DefClass2 df2 = new DefClass2();
        System.out.println(df2.getInt());
        DefClass3 df3 = new DefClass3();
        System.out.println(df3.getInt());
        System.out.println(InterfaceField.YES);



    }
}
