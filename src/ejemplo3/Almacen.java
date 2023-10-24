package ejemplo3;

public interface Almacen<T> {
    void guardar(T objeto);
    T recuperar(int id);

}
