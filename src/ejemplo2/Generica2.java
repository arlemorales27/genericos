package ejemplo2;

public class Generica2 {
    public static void main(String[] args) {
        if(sonIguales(2, 2)){
            System.out.println("si son iguales");
        }else{
            System.out.println("no son iguales");
        }
    }
    public static <T> boolean sonIguales(T a, T b) {
        return a.equals(b);
    }
}
