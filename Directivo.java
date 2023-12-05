public class Directivo extends Empleados {
    public Directivo (String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }

    public void setDirectivo()
    {
        System.out.println("Saludo desde Directivo");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
