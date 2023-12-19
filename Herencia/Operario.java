public class Operario extends Empleados {
    String Ciudad;
    Double Sueldo;
    public Operario(String Nombre, String Codigo){
        super(Nombre,Codigo);
    }
    public void saludoOperario()
    {
        System.out.println("Saludo desde operario");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
