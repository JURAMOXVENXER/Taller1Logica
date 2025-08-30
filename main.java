import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu m = new menu();
        boolean salir = false;
        int opcion;

        System.out.println("=== Bienvenido al sistema de gestión de personas ===");

        while (!salir) {
            // Mostrar opciones del menú
            System.out.println("\n---- MENÚ ----");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        m.agregarPersona();
                        break;
                    case 2:
                        m.mostrarPersonas();
                        break;
                    case 3:
                        m.eliminarPersona();
                        break;
                    case 4:
                        m.buscarPersona();
                        break;
                    case 5:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, por favor elige entre 1 y 5.");
                }
            } catch (Exception e) {
                System.out.println("Debes ingresar un número válido.");
                sc.nextLine(); // limpiar buffer
            }
        }
    }
}