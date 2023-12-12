public class Herencia3 {
    public static void main(String[] args) {
        System.out.println("Objetos de la clase persona:");
        Persona p1 = new Persona();
        Persona p2 = new Persona("Juan", "45");
        System.out.println("\nInformación del objeto p1: ");
        p1.informacion();
    }
}