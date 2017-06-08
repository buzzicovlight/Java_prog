package l0806;

public interface RightStatus {
    boolean isLegal();              //легально ли хранить товар на складе
    int permittedStorageTerm();      //срок разрешенного хранения (в годах)

}
