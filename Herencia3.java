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

    }
}