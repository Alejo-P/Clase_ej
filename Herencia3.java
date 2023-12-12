public class Herencia3 {
    public static void main(String[] args) {
        System.out.println("Objetos de la clase persona:");
        Persona p1 = new Persona();
        Periodista per=new Periodista("Juan", "8726534", 34, "15/03/1988", "A2");
        Chef chef=new Chef();
        Deportista dep=new Deportista("Julio", "76547389");
        System.out.println("\nSaludo original ");
        p1.Saludar();
        System.out.println("Saludo personalizado!");
        per.Saludar();
        chef.Saludar();
        dep.Saludar();
        System.out.println("Imformacion de los impuestos:");
        System.out.printf("\nImpuestos persona1: %.2f",p1.Impuestos(45.34));
        System.out.printf("\nImpuestos persona2: %.2f",per.Impuestos(15.50));
        System.out.printf("\nImpuestos Chef: %.2f", chef.Impuestos(50));
        System.out.printf("\nImpuestos deportista: %.2f",dep.Impuestos(20.75));
    }
}