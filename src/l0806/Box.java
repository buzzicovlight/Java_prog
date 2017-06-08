package l0806;
/*
Ящик
 */
class Box implements Priceable, RightStatus{
    @Override
    public float getPrice(){
        return 0.0f;
    }
    /*
        *Реализация метода ,указывающего на легальность хранения
    */
    @Override
    public boolean isLegal() {
        return false;
    }
    /*
        *Реализация метода, указывающего на сразрешенный срок хранения
    */
    @Override
    public int permittedStorageTerm() {
        return 5;
    }
}
