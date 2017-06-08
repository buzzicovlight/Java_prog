package l0806;
/*
* Бумажный ящик*/
public class PaperBox implements Priceable{
    /*
        Метод, возвращающий цену за коробку
     */
    @Override
    public float getPrice(){
        return 10.0f;
    }
}
