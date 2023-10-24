package ejemplo5;

import java.util.Scanner;

public class MainCRUD {
    public static void main(String[] args) {
        PersonaServiceImpl service = new PersonaServiceImpl();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            // Mostrar menú
            System.out.println("1. Agregar persona");
            System.out.println("2. Actualizar persona");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Mostrar personas");
            System.out.println("5. Salir");
            // Leer opción
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: {
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();

                    PersonaDTO p = new PersonaDTO();
                    p.setNombre(nombre);
                    p.setEdad(edad);

                    service.save(p);
                    System.out.println("Persona agregada!");
                    break;
                }
                case 2: {

                    System.out.print("Ingrese el id de la persona a actualizar: ");
                    int id = scanner.nextInt();

                    PersonaDTO p = service.get(id);

                    if (p == null) {
                        System.out.println("Persona no encontrada");
                    } else {
                        System.out.print("Ingrese el nuevo nombre: ");
                        String nuevoNombre = scanner.next();

                        p.setNombre(nuevoNombre);

                        System.out.print("Ingrese la nueva edad: ");
                        int nuevoEdad = scanner.nextInt();

                        p.setEdad(nuevoEdad);

                        service.update(p);

                        System.out.println("Persona actualizada!");
                    }

                    break;
                }
                case 3: {

                    System.out.print("Ingrese el id de la persona a eliminar: ");
                    int id = scanner.nextInt();

                    service.delete(id);

                    System.out.println("Persona eliminada!");

                    break;
                }
                case 4: {
                    service.getAll().forEach(persona -> {
                        System.out.println("Id:" + persona.getId() + " - " + persona.getNombre() + " - " + persona.getEdad());
                    });
                    break;
                }

            }
        }
    }
}
