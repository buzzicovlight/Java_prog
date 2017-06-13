package l1306;
import java.util.Scanner;
/**
 * Использование перечислений
 */
public class App2 {
    static String getRussianName(Material m) {
        switch (m) {
            case BRONZE:
                return "Бронза";
            case DIAMOND:
                return "Алмаз";
            case WOOD:
                return "Дерево";
            case SILVER:
                return "Серебро";
            case IRON:
                return "Железо";
            case GOLD:
                return "Золото";
            default:
                return "Несуществующий материал";
        }
    }
    public static void main(String[] args) {
        Material m = Material.IRON; // устанавливаем значение перечисления
        //System.out.println(m);, вывод названия материала
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            Material m1 = Material.valueOf(input); // получаем элемент перечисления из строки
            System.out.printf("Прочитали материал = %s \n", m1);
            System.out.println(getRussianName(m1));
            switch (m1) {
                case BRONZE:
                    System.out.println("3-е место. Неплохо");
                    break;
                case GOLD:
                    System.out.println("1-е место. Вы молодец");
                    break;
                case SILVER:
                    System.out.println("2-е место. В следующий раз попробуйете лучше");
                    break;
                default:
                    System.out.println("Такой медали не существует");
                    break;
            }
        } catch (IllegalArgumentException e)
        {
            System.out.println("Был введен неправильный материал");
        }
    }
}
