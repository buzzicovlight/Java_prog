package l0806;
public class App {
    public static void main (String[] args ){
        Box b1 = new Box(); // создание объекта "ящик" и получение ссылки на него
        PaperBox pb1 = new PaperBox();  // создание объекта "бумажный ящик" и получение ссылки на него
        b1.getPrice();                  // получить цену ящика
        b1.isLegal();                   // получить правовй статус
        b1.permittedStorageTerm();     // разрешенный срок хранения
        pb1.getPrice();                 // получить цену коробки
        Priceable pr1 = new Box();      // создаем объект, имеющий ценность
        pr1.getPrice();                 // мы можем только узнать цену
        RightStatus rs1 = new Box();    // создаем объект, имеющий правовой статус
        rs1.isLegal();                  // мы можем узнать только статус
        Priceable[] arr = new Priceable[]{new Box(),new PaperBox()};  /*в массиве могут быть объекты , имеющие цену*/
        RightStatus[] arr2 = new RightStatus[]{new Box(), new Box()}; /*в массиве могут быть только объекты , имеющие правоой статус*/
        //Можем ухнать только правовой статус отдельного предмета
        arr2[0].isLegal();
    }
}
