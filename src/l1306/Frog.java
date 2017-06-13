package l1306;

/**
 * Лягушка
 */
public class Frog implements Amfibia{

    @Override
    public void walk() {
        System.out.println("Лягушка ходит");
    }

    @Override
    public void swim() {
        System.out.println("Лягушка плавает");
    }
}
