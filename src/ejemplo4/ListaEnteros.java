package ejemplo4;

public class ListaEnteros<T extends Number> {
    private T[] enteros;
    private int size;

    public ListaEnteros(int capacidad) {
        // Debes utilizar un arreglo para almacenar los elementos
        enteros = (T[]) new Number[capacidad];
        size = 0;
    }

    public void agregar(T entero) {
        if (size < enteros.length) {
            enteros[size] = entero;
            size++;
        } else {
            System.out.println("La lista está llena. No se puede agregar más elementos.");
        }
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return enteros[indice];
    }

    public int tamaño() {
        return size;
    }

    public static void main(String[] args) {
        ListaEnteros<Integer> lista = new ListaEnteros<>(5);

        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);

        System.out.println("Elementos en la lista:");
        for (int i = 0; i < lista.tamaño(); i++) {
            System.out.println(lista.obtener(i));
        }
    }
}