package l1306;
/**
 * Интерфейс с поведением по умолчанию
 */
public interface InterfaceDefault {
    /*
    * Обычный метод интерфейса*/
    int getD();
    /*
    * Метод имеет реализацию по умолчанию*/
    default int getInt(){
        return getD() + 42;
    }
}
