public class Tecnico extends Operario {
    String Ciudad;
    Double Sueldo;
    public Tecnico(String Nombre, String Codigo)
    {
        super(Nombre, Codigo);
    }

    public void saludoTecnico()
    {
        System.out.println("Saludo desde Tecnico");
        System.out.print("Mi nombre es: ");
        System.out.println(this.getNombre());
    }
    public void setCiudad(String ciudad)
    {
        this.Ciudad=ciudad;
    }
    public void setSueldo(Double sueldo)
    {
        this.Sueldo=sueldo;
    }
    public void getInfo()
    {
        System.out.println("Informacion del directivo");
        System.out.println("Ciudad de residencia: "+this.Ciudad);
        System.out.println("Sueldo: $"+this.Sueldo);
    }
}
