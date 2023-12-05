public class Operario extends Empleados {
    public Operario(String Nombre, String Codigo){
        super(Nombre,Codigo);
    }
    public void setOperario()
    {
        System.out.println("Saludo desde operario");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
