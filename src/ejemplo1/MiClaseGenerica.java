package ejemplo1;

public class MiClaseGenerica<T> {
    T objeto;

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return this.objeto;
    }

}

