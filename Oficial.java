public class Oficial extends Operario {
    String Ciudad;
    Double Sueldo;
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
