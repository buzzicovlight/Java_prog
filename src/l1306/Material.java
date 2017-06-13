package l1306;

/**
 * Возможные материалы в программе
 */
public enum Material {
        IRON(5),              //Железо
        WOOD(1),              //Дерево
        SILVER(20),           //Серебро
        BRONZE(10),           //Бронза
        GOLD(50),             //Золото
        DIAMOND(200);         //Алмаз
     private int price;       //Цена материала
     Material(int price) {
        this.price = price;
     }
     public int getPrice() {
        return this.price;
     }
}
