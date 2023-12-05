public class Oficial extends Operario {
    public Oficial (String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }
    public void setOficial()
    {
        System.out.println("Saludo desde oficial");
        System.out.print("Mi nombre es: ");
        System.out.println(getNombre());
    }
}
