public class Suboficial extends Oficial {
    public Suboficial (String Nombre, String codigo)
    {
        super(Nombre,codigo);
    }

    public void saludoSuboficial()
    {
        System.out.println("Saludo desde Suboficial");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
