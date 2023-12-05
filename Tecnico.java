public class Tecnico extends Operario {
    public Tecnico(String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }

    public void setTecnico()
    {
        System.out.println("Saludo desde Tecnico");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
}
