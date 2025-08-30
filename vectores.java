public class vectores {
    private int max;
    private int indice;
    private persona[] vectorPersona;

    public vectores(int max) {
        this.max = max;
        this.indice = -1;
        this.vectorPersona = new persona[max];
    }

    public boolean vectorVacio() { return indice == -1; }
    public boolean vectorLleno() { return indice == max - 1; }

    public void agregarPersona(persona p) {
        if (!vectorLleno()) {
            indice++;
            vectorPersona[indice] = p;
        } else {
            System.out.println("El vector está lleno");
        }
    }

    public void mostrarVector() {
        if (!vectorVacio()) {
            for (int i = 0; i <= indice; i++) {
                System.out.println("Nombre: " + vectorPersona[i].getNombre() +
                                   ", Apellido: " + vectorPersona[i].getApellido() +
                                   ", Peso: " + vectorPersona[i].getPeso() +
                                   ", Altura: " + vectorPersona[i].getAltura());
            }
        } else {
            System.out.println("El vector está vacío");
        }
    }

    public void eliminarPersona(int posicion) {
        if (!vectorVacio() && posicion >= 0 && posicion <= indice) {
            for (int i = posicion; i < indice; i++) {
                vectorPersona[i] = vectorPersona[i + 1];
            }
            vectorPersona[indice] = null;
            indice--;
        } else {
            System.out.println("Posición inválida o vector vacío");
        }
    }

    public int buscarPersona(String nombre) {
        for (int i = 0; i <= indice; i++) {
            if (vectorPersona[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        System.out.println("No se encontró a la persona");
        return -1;
    }

    public int getIndice() { return indice; }
}