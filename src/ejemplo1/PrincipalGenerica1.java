package ejemplo1;

public class PrincipalGenerica1 {
    public static void main(String[] args) {
        MiClaseGenerica<String> clase1 = new MiClaseGenerica<>();
        clase1.objeto = "Hola, este es un mensaje";
        System.out.println(clase1.getObjeto());
        MiClaseGenerica<Integer> clase2 = new MiClaseGenerica<>();
    }
}
