package ejemplo3;

public class MainEnteros {
    public static void main(String[] args) {
        AlmacenEnteros almacen = new AlmacenEnteros();

        almacen.guardar(10);
        almacen.guardar(20);

        System.out.println(almacen.recuperar(0)); // 10
        System.out.println(almacen.recuperar(1)); // 20
    }
}
