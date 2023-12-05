public class Oficial extends Operario {
    public Oficial (String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }
    public void saludoOficial()
    {
        System.out.println("Saludo desde oficial");
        System.out.print("Mi nombre es: ");
        System.out.println(getNombre());
    }
}
