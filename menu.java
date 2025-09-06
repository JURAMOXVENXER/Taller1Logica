import java.util.Scanner;

public class menu {
    private vectores vector;
    private Scanner scanner;

    public menu() {
        vector = new vectores(10); 
        scanner = new Scanner(System.in);
    }

    public void agregarPersona() {
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
    }

    public void mostrarPersonas() {
        vector.mostrarVector();
    }

    public void eliminarPersona() {
        System.out.print("Digite el nombre de la persona  a eliminar: ");
        String nom = scanner.next();
        int pos = vector.buscarPersona(nom);
        vector.eliminarPersona(pos);
    }

    public void buscarPersona() {
        System.out.print("Nombre a buscar: ");
        String nombreBuscar = scanner.next();
        int encontrado = vector.buscarPersona(nombreBuscar);
        if (encontrado != -1) {
            System.out.println("Persona encontrada en posición: " + encontrado);
        } else {
            System.out.println("No se encontró la persona.");
        }
    }
}