package l1306;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Рыба
 */
public class Fish implements Swimable {
    /*
    * Метод реализующий плавание рыбы */
    @Override
    public void swim(){
        System.out.println("Рыба плывет");
    }

}
