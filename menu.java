import java.util.Scanner;

public class menu {
    static vectores vector = new vectores(10); // Puedes cambiar el tamaño

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar personas");
            System.out.println("3. Eliminar persona");
            System.out.println("4. Buscar persona");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (!vector.vectorLleno()) {
                        System.out.print("Nombre: ");
                        String nombre = scanner.next();
                        System.out.print("Apellido: ");
                        String apellido = scanner.next();
                        System.out.print("Peso: ");
                        float peso = scanner.nextFloat();
                        System.out.print("Altura: ");
                        float altura = scanner.nextFloat();

                        persona p = new persona(nombre, apellido, peso, altura);
                        vector.agregarPersona(p);
                    } else {
                        System.out.println("El vector está lleno");
                    }
                    break;
                case 2:
                    vector.mostrarVector();
                    break;
                case 3:
                    System.out.print("Posición a eliminar: ");
                    int pos = scanner.nextInt();
                    vector.eliminarPersona(pos);
                    break;
                case 4:
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscar = scanner.next();
                    int encontrado = vector.buscarPersona(nombreBuscar);
                    if (encontrado != -1) {
                        System.out.println("Persona encontrada en posición: " + encontrado);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 5);

        scanner.close();
    }
}