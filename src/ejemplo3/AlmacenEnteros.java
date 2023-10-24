package ejemplo3;

import java.util.ArrayList;
import java.util.List;

public class AlmacenEnteros implements Almacen<Integer> {
    private List<Integer> enteros = new ArrayList<>();
    @Override
    public void guardar(Integer num) {
        enteros.add(num);
    }
    @Override
    public Integer recuperar(int id) {
        return enteros.get(id);
    }

}